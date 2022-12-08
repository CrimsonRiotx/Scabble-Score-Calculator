class Scrabble {

    private String word;

    public void setWord(String newWord){
        word = newWord;
    }
    public String getWord(){
        return word;
    }

    int getScore() {
        String convertWord = word.toLowerCase();
        int score = 0;
        int ind = 0;
        boolean isValidWord = true;
        while (ind < convertWord.length()) {
            //switch statement to count/add score for each letter's occurrence
            switch (convertWord.charAt(ind)) {
                case 'a', 'e', 'i', 'l', 'n', 'o', 'r', 's', 't', 'u' -> score++;
                case 'd', 'g' -> score += 2;
                case 'b', 'c', 'm', 'p' -> score += 3;
                case 'f', 'h', 'v', 'w', 'y' -> score += 4;
                case 'k' -> score += 5;
                case 'j', 'x' -> score += 8;
                case 'q', 'z' -> score += 10;
                default -> isValidWord = false;
            }
            ind++;
        }if(isValidWord) {
            return score;
        }
        else return 0;
    }
}
