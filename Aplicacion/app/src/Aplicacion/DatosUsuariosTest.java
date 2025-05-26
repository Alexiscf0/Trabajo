package Aplicacion;

import org.junit.Test;

import static org.junit.Assert.*;

public class DatosUsuariosTest {

    /**
     * Tests for the getContraseña method in the DatosUsuarios class.
     * The getContraseña method is expected to return the value of the Contrasena field of the DatosUsuarios object.
     */

    @Test
    public void testGetContraseñaWithValidPassword() {
        // Arrange
        DatosUsuarios usuario = new DatosUsuarios("Usuario1", "password123");

        // Act
        String contrasena = usuario.getContraseña();

        // Assert
        assertEquals("password123", contrasena);
    }

    @Test
    public void testGetContraseñaWhenNull() {
        // Arrange
        DatosUsuarios usuario = new DatosUsuarios("Usuario1");

        // Act
        String contrasena = usuario.getContraseña();

        // Assert
        assertNull(contrasena);
    }

    @Test
    public void testGetContraseñaWithEmptyPassword() {
        // Arrange
        DatosUsuarios usuario = new DatosUsuarios("Usuario1", "");

        // Act
        String contrasena = usuario.getContraseña();

        // Assert
        assertEquals("", contrasena);
    }

    @Test
    public void testGetContraseñaAfterUpdatingPassword() {
        // Arrange
        DatosUsuarios usuario = new DatosUsuarios("Usuario1", "initialPass");
        usuario.setUbicacion("newPassword");

        // Act
        String contrasena = usuario.getContraseña();

        // Assert
        assertEquals("newPassword", contrasena);
    }

    @Test
    public void testGetContraseñaWithSpecialCharacters() {
        // Arrange
        DatosUsuarios usuario = new DatosUsuarios("Usuario1", "@P@$$w0rd!");

        // Act
        String contrasena = usuario.getContraseña();

        // Assert
        assertEquals("@P@$$w0rd!", contrasena);
    }
}