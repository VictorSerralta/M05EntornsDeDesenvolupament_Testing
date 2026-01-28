package ExercisisEntrenament;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class BankAccountTest {

    @Test
    public void inicializarAtributos() {
        BankAccount bankAccount = new BankAccount("Victor", 300.0);
        assertEquals("Victor", bankAccount.getOwner());
        assertEquals(300.0, bankAccount.getBalance());
    }

    @Test
    public void importPositiu(){
        BankAccount bankAccount = new BankAccount("Victor", 300.0);
        bankAccount.deposit(500.0);
        assertEquals(800.0, bankAccount.getBalance());
    }

    @Test
    public void importNegatiu(){
        BankAccount bankAccount = new BankAccount("Victor", 300.0);
        bankAccount.deposit(-100.0);
        assertEquals(300.0, bankAccount.getBalance());
    }

    @Test
    public void saldoSuficient(){
        BankAccount bankAccount = new BankAccount("Victor", 300.0);
        assertTrue(bankAccount.withdraw(100.0));
        assertEquals(200.0, bankAccount.getBalance());
    }

    @Test
    public void importMassaGranW(){
        BankAccount bankAccount = new BankAccount("Victor", 300.0);
        assertFalse(bankAccount.withdraw(500.0));
        assertEquals(300.0, bankAccount.getBalance());
    }

    @Test
    public void importNegatiuW(){
        BankAccount bankAccount = new BankAccount("Victor", 300.0);
        assertFalse(bankAccount.withdraw(-100.0));
        assertEquals(300.0, bankAccount.getBalance());
    }
}

