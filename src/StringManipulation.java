import java.util.Scanner;

/**
 * Created by kim on 6/26/2015.
 * Prompt a user to input a string of any kind into the console. Then, ignoring special characters,
 * increment each letter one farther down the alphabet (e.g. a->b, o->p, z->a, etc.). Return the string to the console.
 */
//public class StringManipulation {
//    public static void main(String[] args){
//
//        String input = "";
//        String replaceInput = "";
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please give me a string of any kind:  ");
//        input = in.nextLine().toLowerCase();
//        input = input.replaceAll("[^a-zA-Z0-9 ]+", "");
//        input = input.replace(" ", "");
//        System.out.println(input);
//        //replace character with new character
//        for (char character : input.toCharArray()){
//            replaceInput += Character.toString((char) (((character - 'a' + 1) % 26) + 'a'));
//            replaceInput.toLowerCase();
//        }
//
//       // String replaceInput = input.replace('a','b')//.replace('b','c').replace('c','d').replace('d','e').replace('e','f');
////                .replace('g','h').replace('h','i').replace('i','j').replace('j','k').replace('k','l').replace('l','m')
////                .replace('m','n').replace('n','o').replace('o','p').replace('p','q').replace('q','r').replace('r','s')
////                .replace('s','t').replace('t','u').replace('u','v').replace('v','w').replace('w','x').replace('x','y')
////                .replace('y','z');
//
//        System.out.println("New String:  " +replaceInput);
//
//    }
//}
