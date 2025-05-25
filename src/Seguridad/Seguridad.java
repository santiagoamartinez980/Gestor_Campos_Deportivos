package Seguridad;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class Seguridad {
    
    public static String encriptar(String password) {
        return BCrypt.withDefaults().hashToString(12, password.toCharArray());
    }
    
    public static boolean verificarPassword(String passwordIngresada, String hashAlmacenado) {
        BCrypt.Result resultado = BCrypt.verifyer().verify(passwordIngresada.toCharArray(), hashAlmacenado);
        return resultado.verified;
    }



}
