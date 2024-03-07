package prompt;

import Input.Casuale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prompt {

    private static Prompt prompt = new Prompt();
    List<String> promptNoMoney = new ArrayList<>(Arrays.asList(
        "NON C'HAI 'NA LIRA! VAI A LAVORÁ, PEZZENTE!",
        "CHE MORTO DE FAME! TROVA LI SORDI PRIMA DE VENÍ QUA",
        "TORNA QUANDO T'ARIVA LA PENSIONE!",
        "NON C'HAI ABBASTANZA SORDI"
    ));

    public void choosePrompt(List<String> prompt) {

        Integer rng = Casuale.numeroCasualeTra(0, prompt.size()-1);
        System.out.println(prompt.get(rng));
    }

    public static Prompt getPrompt() {
        return prompt;
    }

    public List<String> getPromptNoMoney() {
        return promptNoMoney;
    }

}
