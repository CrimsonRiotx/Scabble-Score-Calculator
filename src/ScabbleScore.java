class Scrabble {

    String word;
    Scrabble (String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        int score = 0;
        int ind = 0;
        int throwaway = 0;
        while (ind < word.length()) {
            //switch statement to count each letter's occurance
            switch (word.charAt(ind)) {
                case 'a':
                    score++;
                    break;
                case 'b':
                    score += 3;
                    break;
                case 'c':
                    score += 3;
                    break;
                case 'd':
                    score += 2;
                    break;
                case 'e':
                    score++;
                    break;
                case 'f':
                    score += 4;
                    break;
                case 'g':
                    score += 2;
                    break;
                case 'h':
                    score += 4;
                    break;
                case 'i':
                    score++;
                    break;
                case 'j':
                    score += 8;
                    break;
                case 'k':
                    score += 5;
                    break;
                case 'l':
                    score++;
                    break;
                case 'm':
                    score += 3;
                    break;
                case 'n':
                    score++;
                    break;
                case 'o':
                    score++;
                    break;
                case 'p':
                    score += 3;
                    break;
                case 'q':
                    score += 10;
                    break;
                case 'r':
                    score++;
                    break;
                case 's':
                    score++;
                    break;
                case 't':
                    score++;
                    break;
                case 'u':
                    score++;
                    break;
                case 'v':
                    score += 4;
                    break;
                case 'w':
                    score += 4;
                    break;
                case 'x':
                    score += 8;
                    break;
                case 'y':
                    score += 4;
                    break;
                case 'z':
                    score += 10;
                    break;
                default: System.out.println("Invalid character found. No more than one word may be used. Only letters are allowed.");
                break;
            }
            ind++;
        }
        return score;
    }
}
