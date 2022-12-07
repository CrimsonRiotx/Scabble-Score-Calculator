class Scrabble {

    String word;
    boolean isValidWord;

    Scrabble (String word) {
        this.word = word.toLowerCase();
    }


    int getScore() {
        int score = 0;
        int ind = 0;
        boolean isValidWord = true;
        while (ind < word.length()) {
            //switch statement to count/add score for each letter's occurrence
            switch (word.charAt(ind)) {
                case 'a':
                case 'e':
                case 'i':
                case 'l':
                case 'n':
                case 'o':
                case 'r':
                case 's':
                case 't':
                case 'u':
                    score++;
                    break;
                case 'd':
                case 'g':
                    score += 2;
                    break;
                case 'b':
                case 'c':
                case 'm':
                case 'p':
                    score += 3;
                    break;

                case 'f':
                case 'h':
                case 'v':
                case 'w':
                case 'y':
                    score += 4;
                    break;
                case 'k':
                    score += 5;
                    break;
                case 'j':
                case 'x':
                    score += 8;
                    break;
                case 'q':
                case 'z':
                    score += 10;
                    break;
                default: isValidWord = false; break;
            }
            ind++;
        }if(isValidWord = true) {
            return score;
        }
        else return 0;
    }
}
