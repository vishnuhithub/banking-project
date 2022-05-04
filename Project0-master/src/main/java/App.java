import java.util.Scanner;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
//import com.example.repository.TxnRepository;
//import com.example.repository.TxnRepositoryImpl;
import com.example.service.TxrService;
import com.example.service.TxrServiceImpl;
import com.example.entity.AccDetails;
import com.example.entity.TDetails;

public class App {

	public static void main(String[] args) {
		
		AccountRepository accountRepository = new JdbcAccountRepository();
		TxrService txrService = new TxrServiceImpl(accountRepository);
		Scanner input = new Scanner(System.in);
		while(true)
		{	
		System.out.println("\nSelect 1 for account creation");
		System.out.println("Select 2 for money transfer");
		System.out.println("Select 3 for account details");
		System.out.println("Select 4 for edit account");
		System.out.println("Select 5 to delete account");
		System.out.println("Select 6 to count Accounts");
		System.out.println("Select 7 for transactions");
		System.out.println("Select 8 to count transactions");
		System.out.println("Select 0 to exit");
		int option = input.nextInt();
		if(option!=0) {
		switch(option) {
		case 1:{
		AccountRepository accRepository = new JdbcAccountRepository(); // a.k.a D.A.O
		System.out.println("Enter  firstName");
		String firstname0 = input.next();
		System.out.println("Enter  lastName");
		String lastname1 = input.next();
		System.out.println("Enter phone");
		String phone = input.next();
		System.out.println("Enter  pancard");
		String pancard2 = input.next();
		System.out.println("Enter  adharcard");
		String adharcard3 = input.next();
		System.out.println("Enter address");
		String address4 = input.next();
		System.out.println("Enter opening balance");
		double balance5 = input.nextDouble();
		AccDetails accdetails = new AccDetails(firstname0,lastname1,phone,pancard2,adharcard3,address4,balance5);
		accRepository.save(accdetails);
		break;
		}
		case 2:{
		AccountRepository accRepository = new JdbcAccountRepository();
		System.out.println("Enter from account");
		String fid = input.next();
		System.out.println("Enter to account");
		String tid = input.next();
		System.out.println("Enter the amount");
		double am = input.nextDouble();
		boolean f = txrService.transfer(am, fid, tid);
		if(f) {
		TDetails tdetails = new TDetails(fid,tid,am);
		accRepository.tsave(tdetails);
		}
		break;
		}
		case 3:
		{
			System.out.println("Enter Account id (0 For all account )");
			int n1=input.nextInt();
			accountRepository.getAccDetails(n1).forEach(accdetails->System.out.println(accdetails));
			break;
		}
		case 4:
		{
			System.out.println("Enter Account id");
			int n1=input.nextInt();
			accountRepository.edit(n1);
			break;
		}
		case 5:{
			System.out.println("Enter Account id)");
			int n1=input.nextInt();
			accountRepository.delete(n1);
			break;
		}
		case 6:{
			System.out.println(accountRepository.countAcc());
			break;
		}
		case 7:{
			accountRepository.getTransfer().forEach(tdetails->System.out.println(tdetails));
			break;
		}
		case 8:{
			System.out.println(accountRepository.count());
			break;	
		}
		}
		}
		else {
			break;
		}
}
}
}