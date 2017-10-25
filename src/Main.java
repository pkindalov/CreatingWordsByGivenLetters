import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by r3v3nan7 on 23.10.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder generatedWord = new StringBuilder();
        StringBuilder letterCombinationWord = new StringBuilder();
        Reader dictReader = new Reader();

        generatedWord.append(dictReader.readFile().toLowerCase());
        String[] allAvailableWordsBG = generatedWord.toString().split(" ");
        int lettersCount = 2;
        boolean isError = false;
//        System.out.println(generatedWord.toString());

        System.out.println("Available words in dictionary: " + allAvailableWordsBG.length);
        System.out.println("Enter count of letters of word to generate(2-7):");
        System.out.println("(For exit just enter exit or stop)");
        String command = reader.readLine();

        while (!command.equals("stop") && !command.equals("exit") && !command.equals("еьит")){

            try{

                lettersCount = Integer.parseInt(command);


            }catch (Exception e){
                System.out.println("Wrong date. Expect a integer number");
                isError = true;
            }

            if(isError){
                break;
            }

            System.out.println("Enter string letters: ");
            String userInput = reader.readLine();

            char[] letters = userInput.toCharArray();

            switch (lettersCount){
                case 2:
                    gen2LettersWords(letters, letterCombinationWord, allAvailableWordsBG, 2);
                    break;
                case 3:
                    gen3LettersWords(letters, letterCombinationWord, allAvailableWordsBG, 3);
                    break;
                case 4:
                    gen4LettersWords(letters, letterCombinationWord, allAvailableWordsBG, 4);
                    break;
                case 5:
                    gen5LettersWords(letters, letterCombinationWord, allAvailableWordsBG, 5);
                    break;
                case 6:
                    gen6LettersWords(letters, letterCombinationWord, allAvailableWordsBG, 6);
                    break;
                case 7:
                    gen7LettersWords(letters, letterCombinationWord, allAvailableWordsBG, 7);
                    break;
                default:
                    System.out.println("Sorry, too big or small value you entered. You can use numbers from two to six");
                    break;
            }


            System.out.println("Enter count of letters of word to generate(2-7):");
            System.out.println("For exit just enter exit or stop");
            command = reader.readLine();
        }






    }

    private static void searchForAword(String str, StringBuilder letterCombinationWord, String[] allAvailableWordsBG, int size) {
        letterCombinationWord.append(str);
//
        for(int i = 0; i < allAvailableWordsBG.length; i++){
            if(allAvailableWordsBG[i].contains(letterCombinationWord.toString()) && allAvailableWordsBG[i].length() == size){
                System.out.println(allAvailableWordsBG[i]);
            }
        }
    }

    private static void gen2LettersWords(char[] letters, StringBuilder letterCombinationWord, String[] allAvailableWordsBG, int size){

        for(int pos1 = 0; pos1 < letters.length; pos1++){
            for(int pos2 = 0; pos2 < letters.length; pos2++){
                if(pos1 != pos2){
                    searchForAword("" + letters[pos1] + letters[pos2], letterCombinationWord, allAvailableWordsBG, size);
                    letterCombinationWord.setLength(0);
                }
            }
        }

//        for(int pos1 = 0; pos1 < letters.length; pos1++){
//            for(int pos2 = 0; pos2 < letters.length; pos2++){
//                for(int pos3 = 0; pos3 < letters.length; pos3++){
//                    for(int pos4 = 0; pos4 < letters.length; pos4++){
//                        for(int pos5 = 0; pos5 < letters.length; pos5++){
//                            for (int pos6 = 0; pos6 < letters.length; pos6++){
//                                if(pos1 != pos2){
//                                    if(pos2 != pos3){
//                                        if(pos3 != pos4){
//                                            if(pos4 != pos5){
//                                                if(pos5 != pos6){
//
//                                                    searchForAword("" + letters[pos1] + letters[pos2], letterCombinationWord, allAvailableWordsBG);
//                                                       letterCombinationWord.setLength(0);
////
////                                                    searchForAword("" + letters[pos2] + letters[pos3], letterCombinationWord, allAvailableWordsBG);
////                                                    letterCombinationWord.setLength(0);
////
////                                                    searchForAword("" + letters[pos3] + letters[pos4], letterCombinationWord, allAvailableWordsBG);
////                                                    letterCombinationWord.setLength(0);
////
////                                                    searchForAword("" + letters[pos5] + letters[pos6], letterCombinationWord, allAvailableWordsBG);
////                                                    letterCombinationWord.setLength(0);
////
////                                                    searchForAword("" + letters[pos4] + letters[pos5], letterCombinationWord, allAvailableWordsBG);
////                                                    letterCombinationWord.setLength(0);
//
////                                                    System.out.print("" + letters[pos1] + letters[pos2] + " ");
////                                                    System.out.print("" + letters[pos2] + letters[pos3] + " ");
////                                                    System.out.print("" + letters[pos3] + letters[pos4] + " ");
////                                                    System.out.print("" + letters[pos5] + letters[pos6] + " ");
////                                                    System.out.print("" + letters[pos4] + letters[pos5] + " ");
////                                                    System.out.println();
//                                                }
////                                                System.out.println();
//                                            }
//                                        }
//                                    }
//                                }
//
//                            }
//                        }
//                    }
//
//                }
//            }
//        }


    }

    private static void gen3LettersWords(char[] letters, StringBuilder letterCombinationWord, String[] allAvailableWordsBG, int size) {

        for(int pos1 = 0; pos1 < letters.length; pos1++){
            for(int pos2 = 0; pos2 < letters.length; pos2++){
                for(int pos3 = 0; pos3 < letters.length; pos3++){
                    if(pos1 != pos2 && pos1 != pos3){
                        if(pos2 != pos3){
                            searchForAword("" + letters[pos1] + letters[pos2] + letters[pos3], letterCombinationWord, allAvailableWordsBG, size);
                            letterCombinationWord.setLength(0);

//                            searchForAword("" + letters[pos1] + letters[pos3] + letters[pos2], letterCombinationWord, allAvailableWordsBG, size);
//                            letterCombinationWord.setLength(0);
//
//                            searchForAword("" + letters[pos2] + letters[pos1] + letters[pos3], letterCombinationWord, allAvailableWordsBG, size);
//                            letterCombinationWord.setLength(0);
//
//                            searchForAword("" + letters[pos2] + letters[pos3] + letters[pos1], letterCombinationWord, allAvailableWordsBG, size);
//                            letterCombinationWord.setLength(0);
//
//                            searchForAword("" + letters[pos3] + letters[pos2] + letters[pos1], letterCombinationWord, allAvailableWordsBG, size);
//                            letterCombinationWord.setLength(0);

//                            searchForAword("" + letters[pos3] + letters[pos1] + letters[pos2], letterCombinationWord, allAvailableWordsBG, size);
//                            letterCombinationWord.setLength(0);
//                            System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3]);
//                            System.out.println("" + letters[pos1] + letters[pos3] + letters[pos2]);
//                            System.out.println("" + letters[pos2] + letters[pos1] + letters[pos3]);
//                            System.out.println("" + letters[pos2] + letters[pos3] + letters[pos1]);
//                            System.out.println("" + letters[pos3] + letters[pos2] + letters[pos1]);
//                            System.out.println("" + letters[pos3] + letters[pos1] + letters[pos2]);
                        }
                    }
                }
            }
        }

    }

    private static void gen4LettersWords(char[] letters, StringBuilder letterCombinationWord, String[] allAvailableWordsBG, int size){
        for(int pos1 = 0; pos1 < letters.length; pos1++){
            for(int pos2 = 0; pos2 < letters.length; pos2++){
                for(int pos3 = 0; pos3 < letters.length; pos3++){
                    for(int pos4 = 0; pos4 < letters.length; pos4++){
                        if(pos1 != pos2 && pos1 != pos3 && pos1 != pos4){
                            if(pos2 != pos3 && pos2 != pos4){

                                searchForAword("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4], letterCombinationWord, allAvailableWordsBG, size);
                                letterCombinationWord.setLength(0);


//                                System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4]);



//                                System.out.println("" + letters[pos1] + letters[pos2] + letters[pos4] + letters[pos3]);
//                                System.out.println("" + letters[pos1] + letters[pos3] + letters[pos2] + letters[pos4]);
//                                System.out.println("" + letters[pos1] + letters[pos3] + letters[pos4] + letters[pos2]);
//
//                                System.out.println("");
                            }
                        }
                    }
                }
            }
        }
    }

    private static void gen5LettersWords(char[] letters, StringBuilder letterCombinationWord, String[] allAvailableWordsBG, int size) {
        for(int pos1 = 0; pos1 < letters.length; pos1++){
            for(int pos2 = 0; pos2 < letters.length; pos2++){
               for(int pos3 = 0; pos3 < letters.length; pos3++){
                   for(int pos4 = 0; pos4 < letters.length; pos4++){
                       for(int pos5 = 0; pos5 < letters.length; pos5++){
                             if(pos1 != pos2 && pos1 != pos3 && pos1 != pos4 && pos1 != pos5){
                                 if(pos2 != pos3 && pos2 != pos4 && pos2 != pos5){

                                     if(pos3 != pos4 && pos3 != pos5 && pos4 != pos5){

                                         searchForAword("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4] + letters[pos5], letterCombinationWord, allAvailableWordsBG, size);
                                         letterCombinationWord.setLength(0);

                                         //5 LETTERS
//                                         System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4] + letters[pos5]);

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


//        }
    }

    private static void gen6LettersWords(char[] letters, StringBuilder letterCombinationWord, String[] allAvailableWordsBG, int size) {
        for(int pos1 = 0; pos1 < letters.length; pos1++){
            for(int pos2 = 0; pos2 < letters.length; pos2++){
                for(int pos3 = 0; pos3 < letters.length; pos3++){
                    for(int pos4 = 0; pos4 < letters.length; pos4++){
                        for(int pos5 = 0; pos5 < letters.length; pos5++){
                            for(int pos6 = 0; pos6 < letters.length; pos6++){

                                if(pos1 != pos2 && pos1 != pos3 && pos1 != pos4 && pos1 != pos5 && pos1 != pos6){
                                    if(pos2 != pos3 && pos2 != pos4 && pos2 != pos5 && pos2 != pos6){
                                        if(pos3 != pos4 && pos3 != pos5 && pos3 != pos6){
                                            if(pos4 != pos5 && pos4 != pos6){
                                                if(pos5 != pos6){

                                                    searchForAword("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4] + letters[pos5] + letters[pos6], letterCombinationWord, allAvailableWordsBG, size);
                                                    letterCombinationWord.setLength(0);
//                                                    System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3] +
//                                                                            letters[pos4] + letters[pos5] + letters[pos6]
//                                                    );
                                                }
                                            }
                                        }
                                    }
                                }


                        }
                    }
                }
            }
        }


        }
    }

    private static void gen7LettersWords(char[] letters, StringBuilder letterCombinationWord, String[] allAvailableWordsBG, int size){
        for(int pos1 = 0; pos1 < letters.length; pos1++){
            for(int pos2 = 0; pos2 < letters.length; pos2++){
                for(int pos3 = 0; pos3 < letters.length; pos3++){
                    for(int pos4 = 0; pos4 < letters.length; pos4++){
                        for(int pos5 = 0; pos5 < letters.length; pos5++){
                            for(int pos6 = 0; pos6 < letters.length; pos6++){
                                for(int pos7 = 0; pos7 < letters.length; pos7++){
                                    if(pos1 != pos2 && pos1 != pos3 && pos1 != pos4 && pos1 != pos5 && pos1 != pos6 && pos1 != pos7){
                                        if(pos2 != pos3 && pos2 != pos4 && pos2 != pos5 && pos2 != pos6 && pos2 != pos7){
                                            if(pos3 != pos4 && pos3 != pos5 && pos3 != pos6 && pos3 != pos7){
                                                if(pos4 != pos5 && pos4 != pos6 && pos4 != pos7){
                                                    if(pos5 != pos6 && pos5 != pos7){
                                                        if(pos6 != pos7){

                                                            searchForAword("" + letters[pos1] + letters[pos2] + letters[pos3] + letters[pos4] + letters[pos5] + letters[pos6] + letters[pos7], letterCombinationWord, allAvailableWordsBG, size);
                                                            letterCombinationWord.setLength(0);
//                                                            System.out.println("" + letters[pos1] + letters[pos2] + letters[pos3]
//                                                                                  + letters[pos4] + letters[pos5] + letters[pos6]
//                                                                                  + letters[pos7]
//                                                            );
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}
