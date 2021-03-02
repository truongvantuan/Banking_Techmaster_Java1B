package vn.techmaster.Banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends BankMethods {

    public static void main(String[] args) {
        int selector;
        int numberOfAccounts = 0;
        ArrayList<CurrentAccount> currentAccounts = new ArrayList<CurrentAccount>();
        do {
            BankMethods.printMainMenu();
            Scanner input = new Scanner(System.in);
            selector = input.nextInt();
            switch (selector) {
                case 11: {
                    if (currentAccounts.isEmpty()) {
                        currentAccounts.add(CurrentAccount.CreateAccount());
                        BankMethods.pressEnter();
                        break;
                    } else {
                        System.out.println("Tài khoản đã được tạo!");
                        BankMethods.pressEnter();
                        break;
                    }

                }
                case 12: {
                    if (currentAccounts.isEmpty()) {
                        System.out.println(">>>>>> Vui lòng mở tài khoản trước!");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        currentAccounts.get(0).withdraw();
                        System.out.println("RÚT TIỀN THÀNH CÔNG!");
                        BankMethods.pressEnter();
                    }
                    break;
                }
                case 13: {
                    if (currentAccounts.isEmpty()) {
                        System.out.println(">>>>>> Vui lòng mở tài khoản trước!");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        currentAccounts.get(0).deposit();
                        System.out.println("NẠP TIỀN THÀNH CÔNG!");
                        BankMethods.pressEnter();
                    }
                    break;
                }


                case 14: {
                    if (currentAccounts.isEmpty()) {
                        System.out.println(">>>>>> Vui lòng mở tài khoản trước!");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        currentAccounts.get(0).printCard();
                        BankMethods.pressEnter();
                    }
                    break;
                }
                case 15: {
                    if (currentAccounts.isEmpty()) {
                        System.out.println(">>>>>> Vui lòng mở tài khoản trước!");
                        BankMethods.pressEnter();
                        break;
                    } else if (currentAccounts.get(0).getTransactions().isEmpty()) {
                        System.out.println("Chưa có giao dịch nào!");
                        BankMethods.pressEnter();
                        break;

                    } else {
                        BankMethods.printTransactionActivityHead();
                        currentAccounts.get(0).getTransactions().forEach((transaction) -> transaction.printTransaction());
                        System.out.println("\n");
                        BankMethods.pressEnter();
                    }
                    break;
                }
                case 21: {
                    if (currentAccounts.isEmpty()) {
                        System.out.println(">>>>>> Vui lòng mở tài khoản trước!");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        currentAccounts.get(0).getSavingAccounts().add(currentAccounts.get(0).createSavingAccount());
                        BankMethods.pressEnter();
                        break;
                    }
                }
                case 22:
                    if (currentAccounts.isEmpty()) {
                        System.out.println(">>>>>> Vui lòng mở tài khoản trước!");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        if (currentAccounts.get(0).getSavingAccounts().isEmpty()) {
                            System.out.println("Chưa có tài khoản tiết kiệm!");
                            BankMethods.pressEnter();
                            break;
                        } else {
                            currentAccounts.get(0).getSavingAccounts().get(0).SavingCalculator();
                            BankMethods.pressEnter();
                            break;
                        }
                    }

                case 23: {
                    if (currentAccounts.isEmpty()) {
                        System.out.println(">>>>>> Vui lòng mở tài khoản trước!");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        if (currentAccounts.get(0).getSavingAccounts().isEmpty()) {
                            System.out.println("Chưa có tài khoản tiết kiệm!");
                            BankMethods.pressEnter();
                            break;
                        } else {
                            BankMethods.printSavingAccountStatementHead();
                            currentAccounts.get(0).getSavingAccounts().get(0).printSavingAccount();
                            BankMethods.pressEnter();
                            break;
                        }
                    }
                }
                case 24: {
                    if (currentAccounts.isEmpty()) {
                        System.out.println(">>>>>> Vui lòng mở tài khoản trước!");
                        BankMethods.pressEnter();
                        break;
                    } else if (currentAccounts.get(0).getSavingAccounts().isEmpty()) {
                        System.out.println("Chưa có tài khoản tiết kiệm!");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        currentAccounts.get(0).deposit(currentAccounts.get(0).getSavingAccounts().get(0).finalSettlement());
                        currentAccounts.get(0).getSavingAccounts().clear();
                        break;
                    }
                }
                case 31: {
                    if (currentAccounts.isEmpty()) {
                        System.out.println(">>>>>> Vui lòng mở tài khoản trước!");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        currentAccounts.get(0).getLoanAccounts().add(currentAccounts.get(0).createLoanAccount());
                        BankMethods.pressEnter();
                        break;
                    }
                }
                case 32: {
                    if (currentAccounts.get(0).getLoanAccounts().isEmpty()) {
                        System.out.println(">>>>>> Chưa có khoản vay nào !");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        currentAccounts.get(0).getLoanAccounts().get(0).printLoanAccount();
                        BankMethods.pressEnter();
                        break;
                    }
                }
                case 33:
                    if (currentAccounts.get(0).getLoanAccounts().isEmpty()) {
                        System.out.println(">>>>>> Chưa có khoản vay nào !");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        currentAccounts.get(0).withdraw(currentAccounts.get(0).getLoanAccounts().get(0).finalSettlement());
                        currentAccounts.get(0).getLoanAccounts().clear();
                        break;
                    }
                case 34:
                    if (currentAccounts.get(0).getLoanAccounts().isEmpty()) {
                        System.out.println(">>>>>> Chưa có khoản vay nào !");
                        BankMethods.pressEnter();
                        break;
                    } else {
                        currentAccounts.get(0).getLoanAccounts().get(0).LoanCalculator();
                        BankMethods.pressEnter();
                        break;
                    }
            }
        } while (selector != 0);
    }
}
