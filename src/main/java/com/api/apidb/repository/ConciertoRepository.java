package com.api.apidb.repository;

import com.api.apidb.model.Concierto;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ConciertoRepository {
    private final Connection connection;

    public ConciertoRepository() throws SQLException {
        // Configuración manual de la conexión
        String url = "jdbc:mysql://localhost:3306/conciertos";
        String username = "root";
        String password = "Pruebasbd_10";
        this.connection = DriverManager.getConnection(url, username, password);
    }

    public List<Concierto> findAll() {
        List<Concierto> conciertos = new ArrayList<>();
        String sql = "SELECT id, nombre, fecha, hora_inicio, lugar, foto_url FROM conciertos.info_conciertos";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Concierto concierto = new Concierto(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getDate("fecha").toLocalDate(),
                        rs.getTime("hora_inicio").toLocalTime(),
                        rs.getString("lugar"),
                        rs.getString("foto_url")
                );
                conciertos.add(concierto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conciertos;
    }

    public Concierto findById(Long id) {
        String sql = "SELECT id, nombre, fecha, hora_inicio, lugar, foto_url FROM conciertos.info_conciertos WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Concierto(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getDate("fecha").toLocalDate(),  // Conversión a LocalDate
                        rs.getTime("hora_inicio").toLocalTime(),   // Conversión a LocalTime
                        rs.getString("lugar"),
                        rs.getString("foto_url")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para cerrar la conexión
    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}

