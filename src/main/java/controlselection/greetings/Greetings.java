package controlselection.greetings;

public class Greetings {
    public String greet(int hour, int minute) {

        if ((hour <= 5) || hour >= 20) {
            if (hour == 20 && minute == 0) {
                return "jó estét";
            }
            if (hour == 5 && minute == 0) {
                return "jó éjt";
            } else if (hour == 5 && minute > 0) {
                return "jó reggelt";
            } else {
                return "jó éjt";
            }

        } else if ((hour < 18 && hour >= 5 && minute > 0) || hour <= 9) {
            if (hour == 9 && minute > 0) {
                return "jó napot";
            } else if (hour == 9 && minute == 0) {
                return "jó reggelt";
            } else if (hour == 9 && minute <= 30) {
                return "jó reggelt";
            } else {
                return "jó napot";
            }

        } else if (hour > 9 && hour < 18) {
            return "jó napot";
        } else if (hour == 18 && minute <= 30) {
            return "jó napot";
        } else if (hour == 18 && minute > 30) {
            return "jó estét";
        } else {
            return "jó estét";
        }

    }
}

