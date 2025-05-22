package com.example.banking.repository;
import com.example.banking.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class AccountRepositoryOracle {
    public void save(Account account) {
        String sql = "INSERT INTO accounts (id, customer_id, balance) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, account.getId());
            stmt.setString(2, account.getCustomerId());
            stmt.setDouble(3, account.getBalance());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
