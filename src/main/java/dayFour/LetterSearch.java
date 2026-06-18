package dayFour;

import java.util.Scanner;

public class LetterSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name !");
        String fullName = sc.nextLine();
        boolean flag = false;
        for(int i = 0 ; i < fullName.length() ; i++){
            char letterFound = fullName.charAt(i);
            if(letterFound == 'A' || letterFound == 'a'){
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("Letter is found and contains letter A , a");
        else
            System.out.println("Letter is not found");
    }
}
