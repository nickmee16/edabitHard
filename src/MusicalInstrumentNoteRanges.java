public class MusicalInstrumentNoteRanges {

    public static void main(String[] args) {

        System.out.println(instrumentRange("Piccolo", "A3"));
        System.out.println(instrumentRange("Violin", "G6"));
        System.out.println(instrumentRange("Piano", "C8"));

    }

    public static boolean instrumentRange(String instr, String note) {
        boolean isCorrect = true;

        if (instr.equals("Piccolo")) {

            if(note.charAt(1) < '4' || note.charAt(1) > '7') {
                isCorrect = false;
            } else if(note.charAt(1) == '4' && note.charAt(0) < 'D') {
                isCorrect = false;
            } else if(note.charAt(1) == '7' && note.charAt(0) > 'C') {
                isCorrect = false;
            }

        } else if (instr.equals("Tuba")) {

            if(note.charAt(1) < '1' || note.charAt(1) > '4') {
                isCorrect = false;
            } else if(note.charAt(1) == '1' && note.charAt(0) < 'D') {
                isCorrect = false;
            } else if(note.charAt(1) == '4' && note.charAt(0) > 'F') {
                isCorrect = false;
            }

        } else if (instr.equals("Guitar")) {

            if(note.charAt(1) < '3' || note.charAt(1) > '6') {
                isCorrect = false;
            } else if(note.charAt(1) == '3' && note.charAt(0) < 'E') {
                isCorrect = false;
            } else if(note.charAt(1) == '6' && note.charAt(0) > 'E') {
                isCorrect = false;
            }

        } else if (instr.equals("Piano")) {

            if(note.charAt(1) < '0' || note.charAt(1) > '8') {
                isCorrect = false;
            } else if(note.charAt(1) == '0' && note.charAt(0) < 'A') {
                isCorrect = false;
            } else if(note.charAt(1) == '8' && note.charAt(0) > 'C') {
                isCorrect = false;
            }

        } else if (instr.equals("Violin")) {

            if(note.charAt(1) < '3' || note.charAt(1) > '7') {
                isCorrect = false;
            } else if(note.charAt(1) == '3' && note.charAt(0) < 'G') {
                isCorrect = false;
            } else if(note.charAt(1) == '7' && note.charAt(0) > 'A') {
                isCorrect = false;
            }

        }

        return isCorrect;

    }
}
