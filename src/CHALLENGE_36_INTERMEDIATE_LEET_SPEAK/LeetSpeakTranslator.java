package CHALLENGE_36_INTERMEDIATE_LEET_SPEAK;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam
 */
import java.util.ArrayList;
import java.util.Random;

public class LeetSpeakTranslator {
	
	private final ArrayList<LeetLetter> translators;
	private final Random rand;
	
	public LeetSpeakTranslator()
	{
		translators = new ArrayList<LeetLetter>();
		rand = new Random();
		
		initTranslators();
	}
	
	private void initTranslators()
	{
		LeetLetter letter = new LeetLetter("a");
		letter.addTranslations("/\\", "4", "@", "/-\\", "^");
		translators.add(letter);
		
		letter = new LeetLetter("b");
		letter.addTranslations("8", "|3", "ß");
		translators.add(letter);
		
		letter = new LeetLetter("c");
		letter.addTranslations("(", "<", "{", "©", "¢");
		translators.add(letter);
		
		letter = new LeetLetter("d");
		letter.addTranslations("|)", "[)");
		translators.add(letter);
		
		letter = new LeetLetter("e");
		letter.addTranslations("3", "£", "€");
		translators.add(letter);
		
		letter = new LeetLetter("f");
		letter.addTranslations("|=");
		translators.add(letter);
		
		letter = new LeetLetter("g");
		letter.addTranslations("6");
		translators.add(letter);
		
		letter = new LeetLetter("h");
		letter.addTranslations("|-|", "#", "]-[", "}{", "}-{");
		translators.add(letter);
		
		letter = new LeetLetter("i");
		letter.addTranslations("!", "1", "|", "¡");
		translators.add(letter);
		
		letter = new LeetLetter("j");
		letter.addTranslations("_|", "_/");
		translators.add(letter);
		
		letter = new LeetLetter("k");
		letter.addTranslations("|<", "|{");
		translators.add(letter);
		
		letter = new LeetLetter("l");
		letter.addTranslations("1", "|_", "|", "¬");
		translators.add(letter);
		
		letter = new LeetLetter("m");
		letter.addTranslations("/\\/\\", "|\\/|", "|v|", "IVI", "^^", "(V)", "/V\\");
		translators.add(letter);
		
		letter = new LeetLetter("n");
		letter.addTranslations("|\\|", "\\/\\");
		translators.add(letter);
		
		letter = new LeetLetter("o");
		letter.addTranslations("0", "()", "Ω");
		translators.add(letter);
		
		letter = new LeetLetter("p");
		letter.addTranslations("¶");
		translators.add(letter);
		
		letter = new LeetLetter("q");
		letter.addTranslations("0_", "0,");
		translators.add(letter);
		
		letter = new LeetLetter("r");
		letter.addTranslations("|2", "®", "l2");
		translators.add(letter);
		
		letter = new LeetLetter("s");
		letter.addTranslations("5", "$", "§");
		translators.add(letter);
		
		letter = new LeetLetter("t");
		letter.addTranslations("7", "+", "†");
		translators.add(letter);
		
		letter = new LeetLetter("u");
		letter.addTranslations("|_|", "µ", "/_/");
		translators.add(letter);
		
		letter = new LeetLetter("v");
		letter.addTranslations("\\/", "√");
		translators.add(letter);
		
		letter = new LeetLetter("w");
		letter.addTranslations("\\/\\/", "vv", "\\\\'", "\\|/", "\\_|_/");
		translators.add(letter);
		
		letter = new LeetLetter("x");
		letter.addTranslations("%", "><");
		translators.add(letter);
		
		letter = new LeetLetter("y");
		letter.addTranslations("'/");
		translators.add(letter);
		
		letter = new LeetLetter("≥");
		letter.addTranslations("1", "7_");
		translators.add(letter);
	}
	
	public String translate(final String the_string)
	{
		StringBuilder sb = new StringBuilder();
		String letter;
		
		for(int i = 0 ; i < the_string.length() ; i++)
		{
			letter = the_string.substring(i, i+1).toLowerCase();
			sb.append(translateLetter(letter));
		}
		
		return sb.toString();
	}
	
	private String translateLetter(final String the_letter)
	{
		// this way it'll return the same thing if no translation is availible
		String letter = the_letter;
		
		for(LeetLetter ll : translators)
		{
			if(ll.equals(the_letter))
			{
				letter = ll.getTranslation(rand);
			}
		}
			
		return letter;
	}

	private class LeetLetter
	{
		// This is the character we'll be converting
		private final String character;
		
		private final ArrayList<String> translations;
		
		public LeetLetter(final String the_char)
		{
			character = the_char;
			translations = new ArrayList<String>();
		}
		
		public void addTranslations(final String... the_translations)
		{
			for(String s : the_translations)
				translations.add(s);
		}
		
		public String getTranslation(final Random the_rand)
		{
			return translations.get(the_rand.nextInt(translations.size()));
		}
		
		public boolean equals(final String the_other)
		{
			boolean same = false;
			
			if(the_other.equals(character))
				same = true;
			
			return same;
		}
	}
        public static void main (String[]args)
        {
            LeetSpeakTranslator acz = new LeetSpeakTranslator();
           String b =  acz.translate("siema");
            System.err.println(b);
            String c = acz.translate(b);
            
        }
}