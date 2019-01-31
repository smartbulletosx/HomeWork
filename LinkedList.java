import TheCubeProject.Cube;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String a = in.next();
        String [] data = new String[2];
        data[0] = "0";
        data[1] = "0";
        int b = in .nextInt();
        LinkedList<Integer> list = new LinkedList();
        for (int i = 0; i < b ; i++) {
            list.add(i + 1);
        }
        String s = new String();
        while (!s.equals("printList")){
            s = in.next();
            if (s.equals("add")){
                s = in.nextLine();
                data = s.split(" ");
                System.out.println(data[0]);
                if(data[1].equals("0")){list.add(toInt(data[0]));}
                else {list.add(toInt(data[0]),Integer.parseInt(data[1]));}
                data[0] = "0";
                data[1] = "0";
            }
            else if (s.equals("set")){
                list.set(in.nextInt(),in.nextInt());
            }
            else if (a.equals("remove")){
                list.remove(in.nextInt());
            }

        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        Cube cube = new Cube();

    }

    private static int toInt(String s) {
        int a = 0;
        int b= 1;
        for (int i = s.length()-1; i >= 0 ; i--) {
            a=+(int)(s.charAt(i))*b;
            b*=10;
        }
        return a;
    }


}
