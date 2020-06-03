package facade;

import facade.entity.Account;
import facade.entity.Address;
import facade.entity.Customer;
import facade.facade.BankFacade;
import facade.facade.CustomerFacade;
import facade.repository.AccountRepository;
import facade.repository.AddressRepository;
import facade.repository.CustomerRepository;

public class FacadeApp {
    public static void main(String[] args) {

        // before
        CustomerRepository customerRepository = new CustomerRepository();
        AddressRepository addressRepository = new AddressRepository();

        Customer customer = new Customer("1", "Eko");
        Address address = new Address("1", "Bandung", "Indonesia");
        Address address1 = new Address("2", "Majalengka", "Indonesia");

        customer.getAddresses().add(address);
        customer.getAddresses().add(address1);

        customerRepository.save(customer);
        addressRepository.save(address);
        addressRepository.save(address1);

        // after

        Customer customer2 = new Customer("1", "Eko");
        Address addressFacade = new Address("1", "Bandung", "Indonesia");
        Address address1Facade = new Address("2", "Majalengka", "Indonesia");
        customer2.getAddresses().add(addressFacade);
        customer2.getAddresses().add(address1Facade);

        CustomerFacade customerFacade = new CustomerFacade();
        customerFacade.save(customer2);



        // case 2
        // before

        AccountRepository accountRepository = new AccountRepository();
        Account account1 = accountRepository.findById("0001");
        Account account2 = accountRepository.findById("0002");

        // transfer 1.000.000 from acount1 to account2
        account1.setBalance(account1.getBalance() - 1000000);
        account2.setBalance(account2.getBalance() + 1000000);

        accountRepository.update(account1);
        accountRepository.update(account2);

        // after
        BankFacade bankFacade = new BankFacade();
        bankFacade.transfer("0001", "0002", 1000000L);
        bankFacade.transfer("0001", "0003", 500000L);
    }
}
