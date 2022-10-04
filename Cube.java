import java.util.ArrayList;
public class Cube {
  //yellow on top blue facing you
  // 6 sides of cube, 3 rows, 3 column
  //char[][][] mixedCube = {
    //{{'y','y','y'},{'y','y','y'},{'y','y','y'}},
    //{{'g','g','g'},{'g','g','g'},{'g','g','g'}},
    //{{'o','o','o'},{'o','o','o'},{'o','o','o'}},
    //{{'w','w','w'},{'w','w','w'},{'w','w','w'}},
    //{{'r','r','r'},{'r','r','r'},{'r','r','r'}},
    //{{'b','b','b'},{'b','b','b'},{'b','b','b'}}
  //};

  //char[][][] solvedCube = {
    //{{'y','y','y'},{'y','y','y'},{'y','y','y'}},
    //{{'g','g','g'},{'g','g','g'},{'g','g','g'}},
    //{{'o','o','o'},{'o','o','o'},{'o','o','o'}},
    //{{'w','w','w'},{'w','w','w'},{'w','w','w'}},
    //{{'r','r','r'},{'r','r','r'},{'r','r','r'}},
    //{{'b','b','b'},{'b','b','b'},{'b','b','b'}}
  //};


  //public static void moves(String move){
    //switch (move) {
      //case ("u"):
      //break;
      //case ("u'"):
      //break;
      //case ("d"):
      //break;
      //case ("d'"):
      //break;
      //case ("r"):
      //break;
      //case ("r'"):
      //break;
      //case ("l"):
      //break;
      //case ("l'"):
      //break;
      //case ("f"):
      //break;
      //case ("f'"):
      //break;
      //case ("b"):
      //break;
      //case ("b'"):
      //break;
      //default:
        //move=null;
    //}
  //}

	public static void main(final String[] args){
    if(args.length != 0){
      int n = args.length;
      for (int i = n; i > 0; i--){
        System.out.println(args[i-1]);
      }
      //ArrayList<String> movesMade = new ArrayList<>();
      //for(String i : args){
      //  movesMade.add(i);
      //}
      //for (int j = movesMade.size(); j>0 ; j--){
      //  System.out.println(movesMade.get(j));
      //}
    }else{
      System.out.println("no argument(s) detected! Please enter moves in quotations.");
    }
  }
}


/* Notes: u d r l f b --> and primes
 * Switch(input){
 * 
 * }
 * 
 * The inputs for this program will also be restricted to (u, d, r, l, f, b) or (u', d', r', l', f', b')
 * 
 * cannot use random to find solution, must work out from solved cube AND mixed cube (meet in the middle)
 * save every different move for both cubes and eventually they will meet in the middle and then bridge the paths.
 * 
 * class: string, scanner, system
 * Object: what you create from a class--> Strind s2 = new Sting("hi there");
 * method that represents an object
 * String str = "Hello"; is equal to String str = new String("Hello");
 * length--> returns length of a String
 * concat--> attatches two strings
 * toUpperCase -- toLowerCase --> you know what this does
 * compareTo --> returns 0 if strings are the same
 * startsWith -- endsWith -- contains -- trim--> removes
 */