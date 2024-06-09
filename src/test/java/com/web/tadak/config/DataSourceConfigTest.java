package com.web.tadak.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class DataSourceConfigTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testDataSourceConnection() {

        try(Connection connection = dataSource.getConnection()){
            assertThat(connection).isNotNull();

            try(Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT 1")){
                assertThat(resultSet.next()).isTrue();
                assertThat(resultSet.getInt(1)).isEqualTo(1);
            }

        } catch (SQLException e) {
            fail("Database connection test failed: " + e.getMessage());
        }

    }



}
