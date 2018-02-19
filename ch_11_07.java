import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ch_11_07
{
    /*Write a method countCommon that accepts two lists of integers as parameters and returns the number of unique integers
that occur in both lists.
Use one or more sets as storage to help you solve this problem. For example, if one list contains
the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains the values [–5, 15, 2, –1, 7,
15, 36], your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists.*/
    public static void main(String[] args)
    {

        List<Integer> list1 = new LinkedList<>();
        list1.add(3);
        list1.add(7);
        list1.add(3);
        list1.add(-1);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(2);
        list1.add(15);
        list1.add(15);

        List<Integer> list2 = new LinkedList<>();
        list2.add(-5);
        list2.add(15);
        list2.add(2);
        list2.add(-1);
        list2.add(7);
        list2.add(15);
        list2.add(36);

        countCommon(list1, list2);


    }
    public static int countCommon (List<Integer>list1, List<Integer>list2)
    {
        Set<Integer> finalList = new HashSet<>();
        for (Integer i: list1)
        {
            if (list2.contains(i))
            {
                finalList.add(i);
            }
        }
        for (Integer i: list2)
        {
            if (list1.contains(i))
            {
                finalList.add(i);
            }
        }

        System.out.println(finalList.size());
        return finalList.size();
    }
}
