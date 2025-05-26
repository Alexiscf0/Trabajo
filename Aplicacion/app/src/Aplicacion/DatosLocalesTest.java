package Aplicacion;

import org.junit.Test;

import static org.junit.Assert.*;

public class DatosLocalesTest {

    /**
     * Test for the getNombre method in the DatosLocales class.
     * Verifies that it correctly retrieves the name of the instance.
     */

    @Test
    public void testGetNombreReturnsCorrectNameWhenNameIsSet() {
        // Arrange
        String expectedNombre = "Cafeteria Bonita";
        DatosLocales datosLocales = new DatosLocales(expectedNombre, "Cafeteria", "Centro", 4.5f);

        // Act
        String actualNombre = datosLocales.getNombre();

        // Assert
        assertEquals(expectedNombre, actualNombre);
    }

    @Test
    public void testGetNombreReturnsDefaultNameWhenNameIsEmpty() {
        // Arrange
        String expectedNombre = "";
        DatosLocales datosLocales = new DatosLocales(expectedNombre, "Restaurante", "Playa", 4.8f);

        // Act
        String actualNombre = datosLocales.getNombre();

        // Assert
        assertEquals(expectedNombre, actualNombre);
    }

    @Test
    public void testGetNombreReturnsCorrectNameAfterSetNameIsCalled() {
        // Arrange
        String initialNombre = "Initial Nombre";
        String updatedNombre = "Updated Nombre";
        DatosLocales datosLocales = new DatosLocales(initialNombre, "Hotel", "Montaña", 3.9f);

        // Act
        datosLocales.setNombre(updatedNombre);
        String actualNombre = datosLocales.getNombre();

        // Assert
        assertEquals(updatedNombre, actualNombre);
    }
}