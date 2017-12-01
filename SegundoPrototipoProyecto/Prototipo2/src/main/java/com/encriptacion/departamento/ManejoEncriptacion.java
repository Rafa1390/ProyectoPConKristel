package com.encriptacion.departamento;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.crypto.Cipher;

public class ManejoEncriptacion {
	private final String KEY_EXTENSION = ".key";
	private final String PUBLIC = "public";
	private final String PRIVATE = "private";
	private final String MESSAGE_ENCRYPT_EXTENSION = ".encript";
	private final String PATH_PUB = "C:/Users/rafab/Documents/Programación de software/007 Patrones/Proyecto Patrones/SegundoPrototipoProyecto/LlavesPublicas/";
	private final String PATH_PRIV = "C:/Users/rafab/Documents/Programación de software/007 Patrones/Proyecto Patrones/SegundoPrototipoProyecto/LlavesPrivadas/";
	
	public void crearLlave(String nombre)throws Exception{
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		KeyFactory fact = KeyFactory.getInstance("RSA");
		kpg.initialize(2048);
		KeyPair kp = kpg.genKeyPair();
		RSAPublicKeySpec pub = fact.getKeySpec(kp.getPublic(),
				  RSAPublicKeySpec.class);
		RSAPrivateKeySpec priv = fact.getKeySpec(kp.getPrivate(),
				  RSAPrivateKeySpec.class);
		
		guardarArchivo(PATH_PUB + nombre+"public.key", pub.getModulus(),
				  pub.getPublicExponent());
		guardarArchivo(PATH_PRIV + nombre+"private.key", priv.getModulus(),
				  priv.getPrivateExponent());
	}
	
	public void guardarArchivo(String nomArchivo, BigInteger mod, BigInteger exp) throws IOException {
		ObjectOutputStream oout = new ObjectOutputStream(
			    new BufferedOutputStream(new FileOutputStream(nomArchivo)));
		try {
			oout.writeObject(mod);
			oout.writeObject(exp);
		} catch (Exception e) {
			throw new IOException("Error inesperado", e);
		} finally {
		    oout.close();
		}
	}
	
	Key leerArchivoLlave(String nomLlave, String tipo, String direccion) throws IOException {
		InputStream in = new FileInputStream (direccion + nomLlave+ tipo + KEY_EXTENSION);
		ObjectInputStream oin = new ObjectInputStream(new BufferedInputStream(in));
		try {
			BigInteger m = (BigInteger) oin.readObject();
		    BigInteger e = (BigInteger) oin.readObject();
		    if(tipo.equals("public")) {
		    	RSAPublicKeySpec keySpec = new RSAPublicKeySpec(m, e);
			    KeyFactory fact = KeyFactory.getInstance("RSA");
			    PublicKey pubKey = fact.generatePublic(keySpec);
			    return pubKey;
		    }else {
		    	RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(m, e);
			    KeyFactory fact = KeyFactory.getInstance("RSA");
			    PrivateKey pubKey = fact.generatePrivate(keySpec);
			    return pubKey;
		    }
		}catch(Exception e) {
			throw new RuntimeException("Serialisación erronea", e);
		}finally {
			oin.close();
		}
	}
	
	private void writeBytesFile(String name, byte[] content, String type) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream(PATH_PUB + name + type);
		fos.write(content);
		fos.close();
	}
	
	public void encriptarMensaje(String nomMensaje, String mensaje, String nomLlave) throws Exception {
		PublicKey pubKey = (PublicKey)leerArchivoLlave(nomLlave, PUBLIC, PATH_PUB);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, pubKey);
		byte[] encryptedData = cipher.doFinal(mensaje.getBytes(StandardCharsets.UTF_8));
		Encoder oneEncoder = Base64.getEncoder();
		encryptedData = oneEncoder.encode(encryptedData);
		writeBytesFile(nomMensaje,encryptedData,MESSAGE_ENCRYPT_EXTENSION);
	}
}
