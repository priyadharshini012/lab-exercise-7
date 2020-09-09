/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author priyadharshini
 */
public class employe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
        
                employee e1=new employee("qqq",20500);
        employee e2=new employee("zzz",10000);
        employee e3=new employee("ppp",6000);
        employee e4=new employee("xxx",55000);
        employee e5=new employee("kkk",19000);
        employee e6=new employee("ccc",23000);
        employee e7=new employee("sss",7000);
        employee e8=new employee("lll",42000);
        employee e9=new employee("nnn",34000);
        employee e10=new employee("aaa",8000);
        employee e11=new employee("wwww",9000);
        employee e12=new employee("rrr",72000);
        employee e13=new employee("eee",50000);
        employee e14=new employee("fff",45000);

        ArrayList<employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        list.add(e10);
        list.add(e11);
        list.add(e12);
        list.add(e13);
        list.add(e14);

        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println(list);
        
    }
    
}
class employee
{
    String name;
    double salary;
    employee(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String toString()
    {
        return "\nEmployee Name:"+name+"\tSalary:"+salary;
    }

    Object name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class namesort implements Comparator<employee>
{
    @Override
    public int compare(employee e1,employee e2)
    {
        
        return e1.name.compareTo(e2.name);// positive / negative
    }
}


        // TODO code application logic here
    
    

