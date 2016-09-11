package homeworkModule4;


public class Main {
    public static void main(String[] args) {

        Bank USBank = new USBank(1092893, "USA", Currency.USD, 15, 850, 12, 55467834);
        Bank EUBank = new EUBank(12346213, "France", Currency.EUR, 43, 1200, 4, 1239975342);
        Bank ChinaBank = new ChinaBank(21234, "China", Currency.USD, 143, 350, 65, 3245723);

        User Sergii = new User(1, "Sergii", 25000, 32, "ANTONOV", 1000, USBank);
        User Darren = new User(45, "Darren", 2000, 4, "Wings", 550, USBank);
        User Arnold = new User(32, "Arnold", 25000, 15, "Duplo", 850, EUBank);
        User Sienna = new User(2, "Sienna", 25000, 86, "La Petit", 2500, EUBank);
        User Montley = new User(345, "Montley", 25000, 8, "Xiao", 300, ChinaBank);
        User Wung = new User(2321, "Wung", 25000, 9, "Zhung", 540, ChinaBank);

        BankSystem bankSystem = new BankSystemImpl();


        bankSystem.withdrawOfUser(Sergii, 200);
        bankSystem.fundUser(Sergii, 150);
        bankSystem.transferMoney(Sergii, Wung, 100);
        bankSystem.paySalary(Sergii);
        System.out.println(Sergii);


        bankSystem.withdrawOfUser(Darren, 800);
        bankSystem.fundUser(Darren, 50);
        bankSystem.transferMoney(Darren, Sergii, 1000);
        bankSystem.paySalary(Darren);
        System.out.println(Darren);


        bankSystem.withdrawOfUser(Wung, 20);
        bankSystem.fundUser(Wung, 150);
        bankSystem.transferMoney(Wung, Arnold, 10000);
        bankSystem.paySalary(Wung);
        System.out.println(Wung);


        bankSystem.withdrawOfUser(Sienna, 0);
        bankSystem.fundUser(Sienna, 750);
        bankSystem.transferMoney(Sienna, Montley, 40);
        bankSystem.paySalary(Sienna);
        System.out.println(Sienna);


        bankSystem.withdrawOfUser(Montley, 35);
        bankSystem.fundUser(Montley, 150);
        bankSystem.transferMoney(Montley, Sienna, 100);
        bankSystem.paySalary(Montley);
        System.out.println(Montley);


        bankSystem.withdrawOfUser(Arnold, 430);
        bankSystem.fundUser(Arnold, 111);
        bankSystem.transferMoney(Arnold, Wung, 2000);
        bankSystem.paySalary(Arnold);
        System.out.println(Arnold);


    }
}
