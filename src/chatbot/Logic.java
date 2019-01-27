package chatbot;

import java.util.Random;

public class Logic {
    
    private final String[][] chatBot = new Dialogs().getDialogs();
    private String Question = "";
    private int response = 0;
    
    private void setResponse(int response)
    {
        Random r = new Random();
        final String[] znaki = {"+", "-"};
        if (znaki[r.nextInt(2)].equals("+"))
        {
            response += r.nextInt(2);
        }else{
            response -= r.nextInt(2);
        }
        this.response = response;
    }
    
    public int getResponse()
    {
        return this.response;
    }
    
    public String Answer(String Question)
    {
        //Formatowanie pytania zadanego przez użytkownika.
        Question.trim();
        while(
            Question.charAt(Question.length()-1)=='!' ||
            Question.charAt(Question.length()-1)=='.' ||
            Question.charAt(Question.length()-1)=='?'
        )
        {
            Question=Question.substring(0,Question.length()-1);
        }
        Question.trim();
        byte response=0;
        /*
        0:przeszukujemy dialogi w poszukiwaniu podobieństw
        1:jeżeli nic nie znaleźliśmy
        2:jeżeli coś znaleźliśmy
        */
        //Szukanie podobieństw
        int j=0;//którą grupę sprawdzamy
        while(response==0)
        {
            if(inArray(Question.toLowerCase(),chatBot[j*2]))
            {
                response=2;
                int r=(int)Math.floor(Math.random()*chatBot[(j*2)+1].length);
                this.Question = ("\n-->Jędrzej:\t"+chatBot[(j*2)+1][r]);
                setResponse(6);
            }
            j++;
            if(j*2==chatBot.length-1 && response==0)
            {
                response=1;
            }
        }

        //-----domyślne-------------
        if(response==1)
        {
            int r=(int)Math.floor(
                        Math.random()*chatBot[chatBot.length-1].length);
            this.Question = ("\n-->Jędrzej:\t"+chatBot[chatBot.length-1][r]);
            setResponse(10);
        }
        return this.Question;
    }
    
    private boolean inArray(String in,String[] str)
    {
        boolean match=false;
        for (String str1 : str)
        {
            if (str1.equals(in))
            {
                match=true;
            }
        }
        return match;
    }
}
