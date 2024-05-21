package programming;

public class Bank {
		String name;
		int bankCode;
		int pin;
		double balance;
		boolean panCard;
		long Phno;
		
		Bank(String name, int bankCode, boolean panCard, long Phno, int pin){
			this.name = name;
			this.bankCode = bankCode;
			this.panCard = panCard;
			this.Phno = Phno;
			this.setPin(pin);
		}
		
		void details(){
			System.out.println("Name = " + this.name);
			System.out.println("bankCode = " + this.bankCode);
			System.out.println("Balance = " + this.balance);
			System.out.println("PanCard = " + this.panCard);
			System.out.println("Phone number = " + this.Phno);
		}
		void setPin(int pin){
			if((pin >= 1000) && (pin <= 9999)){
				this.pin = pin;
			}
			else{
				System.out.println("Enter 4 digit number");
			}
		}
		void deposit(int pin, int amount){
			if((pin >= 1000) && (pin <= 9999)){
				if(this.pin == pin){
					if(panCard == true || amount <= 100000){
						this.balance = this.balance + amount;
						System.out.println("Balance Updated");
						System.out.println("Current Balance : " + this.balance);
					}
					else{
						System.out.println("Link Pan Card");
					}
				}
				else{
					System.out.println("Invalid Pin");
				}
			}
			else{
				System.out.println("Enter 4 digin number");
			}
		}
		
		void checkBalance(int pin){
			if((pin >= 1000) && (pin <= 9999)){
				if(this.pin == pin){
					System.out.println("Balance : " + this.balance);
					if((bankCode == 2) || (bankCode == 3)){
						if(this.balance > 10000){
							
							System.out.println("ALERT");
							System.out.println(10000 - this.balance + " must deposit ");
							System.out.println("Minimum 10000 balance is required");
						}
					}
					else if((bankCode == 1) || (bankCode == 4)){
						// No need of minimum balance
					}
				}
				else{
					System.out.println("Invalid Pin");
				}
			}
			else{
				System.out.println("Enter 4 digit number");
			}
		}
		
		void withdraw(int pin, int amount){
			if((pin >= 1000) && (pin <= 9999)){
				if(this.pin == pin){
					if(this.balance >= amount){
						if((this.panCard == true) || (amount <= 50000)){
							this.balance = this.balance - amount;
							System.out.println("Balance Deducted");
							System.out.println("Current Balance : " + this.balance);
							
					if((bankCode == 2) || (bankCode == 3)){
						if(this.balance > 10000){						
							System.out.println("ALERT");
							System.out.println(10000 - this.balance + " must deposit ");
							System.out.println("Minimum 10000 balance is required");
						}
					}
					else if((bankCode == 1) || (bankCode == 4)){
				
						// No need of minimum balance
					}
						}
						else{
							System.out.println("Link Pan-Card");
							System.out.println("Current Balance : " + this.balance);
						}
					}
					else{
						System.out.println("Insufficient Balance");
					}
				}
				else{
					System.out.println("Invalid Pin");
				}
			}
			else{
				System.out.println("Enter 4 digit number");
			}
		}		
		void updatePhno(long old_phNo, long new_phNo, int pin){
			if((pin >= 1000) && (pin <= 9999)){
				if(this.pin == pin){
					if(this.Phno == old_phNo){
						this.Phno = new_phNo;
						System.out.println("Phone number updated");
					}
					else{
						System.out.println("Incorrect Phone number");
					}
				}
				else{
					System.out.println("Invalid Pin");
				}
			}
			else{
				System.out.println("Enter 4 digit number");
			}
		}
		
		public static void main(String args[]){
			Bank b1 = new Bank("AAstha", 2, true, 9988776665l, 1234);
			b1.details();
			Bank b2 = new Bank("Arpit", 1, true, 6262944189l, 1234);
			b2.details();
			Bank b3 = new Bank("manan", 1, true, 9098939687l, 1234);
			b3.details();
		 	b1.deposit(1234, 10000);
			b1.checkBalance(1234);
			b1.withdraw(1234, 5000);
		}
	}