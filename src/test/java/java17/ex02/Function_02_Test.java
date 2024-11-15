package java17.ex02;

import java.util.function.BiFunction;

import org.junit.Test;

import java17.data.Account;
import java17.data.Person;

/**
 * Exercice 02 - java.util.function.BiFunction
 */
public class Function_02_Test {

    //  tag::buildAccount[]
    // TODO Compléter la fonction buildAccount
    // TODO la fonction possède 2 paramètres en entrée : une personne et un solde
    BiFunction<Person, Integer, Account> buildAccount (Person p, Integer a) {
        return (pers, s) -> {
            Account account = new Account();
            account.setBalance(a);
            account.setOwner(p);
            return account;
        };

    }
    //  end::buildAccount[]

    @Test
    public void test_build_account() throws Exception {

        // TODO invoquer la fonction buildAccount pour que le test soit passant
        Person person = new Person("John", "France", 80, "pass");
        Account result = buildAccount(person, 500).apply(person,500);;

        assert result.getOwner().getFirstname().equals("John");
        assert result.getOwner().getLastname().equals("France");
        assert result.getOwner().getAge().equals(80);
        assert result.getOwner().getPassword().equals("pass");
    }


}
