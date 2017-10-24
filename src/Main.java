import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by r3v3nan7 on 23.10.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter string letters: ");
        String userInput = reader.readLine();

        char[] letters = userInput.toCharArray();

        for(int pos1 = 0; pos1 < letters.length; pos1++){
            for(int pos2 = 0; pos2 < letters.length; pos2++){
               for(int pos3 = 0; pos3 < letters.length; pos3++){
                   for(int pos4 = 0; pos4 < letters.length; pos4++){
                       for(int pos5 = 0; pos5 < letters.length; pos5++){
                             if(pos1 != pos2 && pos1 != pos3 && pos1 != pos4 && pos1 != pos5){
                                 if(pos2 != pos3 && pos2 != pos4 && pos2 != pos5){

                                     if(pos3 != pos4 && pos3 != pos5 && pos4 != pos5){

                                         //5 LETTERS
                                         System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4] + letters[pos5]);

                                         //3 LETTERS
//                                           System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3]);

                                         //4 LETTERS
//                                         System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4]);

                                     }
                                 }


                             }

//                           System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3]);

//                           System.out.println("" + letters[pos1] + letters[pos2]);
//                           System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3]);
//                           System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4]);
//                           System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4] + letters[pos5]);
//
//                           System.out.println("" + letters[pos2] + letters[pos1]);
//                           System.out.println("" + letters[pos1] + letters[pos3] + letters[pos2]);
//                           System.out.println("" + letters[pos2] + letters[pos1] + letters[pos3]);
//
//                           System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4]);


                       }
                   }
               }
            }
        }


//        String word = "";
//        char[] letters = new char[] {'с' , 'т', 'м', 'р', 'а', 'о', 'й'};


//        for(int i = 0; i < letters.length - 1; i++){
//            letters[i] = letters[i + 1];
//            letters[i + 1] = letters[i];
////
//            change3letters(letters);
//            change3letters(letters);


//            changeLettersPosToCreateWord(letters);
//
//            makingWordsWithFirst3Letters(letters);
//
//            makingWordWithLast3letters(letters);

//        }




    }

    private static void change3letters(char[] letters) {
        //all 3 combinations first part of array
        StringBuilder word = new StringBuilder();
        int index = letters.length / 2;


        changePositionOfLetters(letters, word, index);

        changeLetterPosFromMiddleToBottom(letters, word, index);


        for(int a = 0; a < letters.length; a++){
            word.append(letters[a]);
            for(int b = a + 1; b < letters.length; b++){
                word.append(letters[b]);
            }
            System.out.println(word.toString());
            word.delete(0, word.length());
        }



    }

    private static void changeLetterPosFromMiddleToBottom(char[] letters, StringBuilder word, int index) {
        for(int a = index; a < letters.length; a++){
            word.append(letters[a]);
            for(int b = index + 1; b < letters.length; b++){
                word.append(letters[b]);
            }
            System.out.println(word.toString());
            word.delete(0, word.length());

        }
    }

    private static void changePositionOfLetters(char[] letters, StringBuilder word, int index) {
        for(int a = 0; a < index; a++){
            word.append(letters[a]);
            for(int b = a + 1; b <= index; b++){

                word.append(letters[b]);
            }
            System.out.println(word.toString());
            word.delete(0, word.length());

        }
        System.out.println(word.toString());

    }

//    private static void makingWordWithLast3letters(char[] letters) {
//        StringBuilder wordBuilder = new StringBuilder();
//        for(int l = (letters.length / 2); l >= 0; l--){
////            System.out.print(letters[l]);
//            wordBuilder.append(letters[l]);
//            System.out.println(wordBuilder.toString());
//            for(int l2 = (letters.length / 2) - 1; l2 >= 0; l2--){
//                  wordBuilder.append(letters[l2]);
//                  System.out.println(wordBuilder.toString());
////                System.out.print(letters[l2]);
//            }
//            System.out.println();
//        }
////        System.out.println(wordBuilder.toString());
//    }
//
//    private static void makingWordsWithFirst3Letters(char[] letters) {
//        StringBuilder wordBuilder = new StringBuilder();
//        for(int l = 0; l < letters.length / 2; l++){
//             wordBuilder.append(letters[l]);
////             System.out.println(wordBuilder.toString());
//            System.out.print(letters[l]);
//            for(int l2 = 1; l2 < letters.length / 2; l2++){
//                  wordBuilder.append(letters[l2]);
////                  System.out.println(wordBuilder.toString());
//                System.out.print(letters[l2]);
//            }
//            System.out.println();
//        }
////        System.out.println(wordBuilder.toString());
//    }
//
//    private static void changeLettersPosToCreateWord(char[] letters) {
//        StringBuilder wordBuilder = new StringBuilder();
//        for(int l = 0; l < letters.length; l++){
////            wordBuilder.append(letters[l]);
//            System.out.print(letters[l]);
//            for(int l2 = 1; l2 < letters.length; l2++){
////                wordBuilder.append(letters[l2]);
//                System.out.print(letters[l2]);
//
//            }
//            System.out.println();
//        }
////        System.out.println(wordBuilder.toString());
//
//    }

}
