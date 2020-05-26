package alphabetapruning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WordSearch {
	
	private int rows;
	private int columns;
	private char[][] theBoard;
	private Object [] theWords;
	private BufferedReader puzzleStream;
	private BufferedReader wordStream;
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public WordSearch () throws IOException  {
		puzzleStream = openFile(" Enter puzzle file ");
		wordStream = openFile(" Enter a dictionary name ");
		System.out.println("Reading Files ...");
		readPuzzle();
		readWords();
	}
	
	
	public int solvePuzzle() { 
		
		int matches = 0;
		
		for(int r = 0; r < rows; r++)
			for(int c = 0; c < columns; c++)
				for(int rd = -1; rd <= 1; rd++)
					for(int cd = -1; cd <=1; cd++)
						if(rd != 0 || cd != 0)
							matches += solveDirection(r,c,rd,cd);
		
		return matches;
	}
	
	
	private static int prefixSearch(Object[] a, String x) { 
		
		int idx = Arrays.binarySearch(a, x);
		
		if(idx < 0) { 
			return -idx -1;
		} 
		
		return idx;
	}
	
	
	private BufferedReader openFile(String message) { 
		String fileName = "";
		FileReader theFile;
		BufferedReader fileIn = null;
		
		do { 
			System.out.println(String.format("message : %s", message));
			
			try {
				fileName = in.readLine();
				if(fileName == null) { 
					System.exit(0);
				}
				theFile = new FileReader(fileName);
				fileIn = new BufferedReader(theFile);
			} catch(IOException e) { 
				System.err.println(String.format("Cannot open : %s", fileName));
			}
			
		}while(fileIn == null);
		
		return fileIn;
	}
	
	
	private void readWords() throws IOException { 
		List words = new ArrayList<>();
		
		String lastWord= null;
		String thisWord;
		
		while((thisWord = wordStream.readLine()) != null) { 
			
			if(lastWord != null && thisWord.compareTo(lastWord) > 0) { 
				System.err.println("Dictionary is not sorted, skipping ...");
				continue;
			}
			
			words.add(thisWord);
			lastWord = thisWord;
			
		}
		
		this.theWords = new String[words.size()];
		Iterator itr = words.iterator();
		for(int i = 0; itr.hasNext(); i++) { 
			this.theWords[i] = (String) itr.next();
		}
	}
	
	
	private void readPuzzle() throws IOException  { 
		String oneLine;
		List puzzleLines = new ArrayList<>();
		
		if((oneLine = puzzleStream.readLine()) == null) { 
			throw new IOException("No lines in puzzle file");
		}
		
		this.columns = oneLine.length();
		puzzleLines.add(oneLine);
		
		while((oneLine = puzzleStream.readLine()) != null) { 
			if(oneLine.length()!= columns) { 
				System.err.println("Puzzle not rectangular; skipping row");
			}else { 
				puzzleLines.add(oneLine);
			}
		}
		
		this.rows = puzzleLines.size();
		this.theBoard = new char[rows][columns];
		Iterator itr = puzzleLines.iterator();
		
		for(int r = 0; r < rows; r++) { 
			String theLine = (String) itr.next();
			this.theBoard[r] = theLine.toCharArray();
		}
		
	}
	
	
	private int solveDirection(int baseRow, int baseCol, int rowDelta, int colDelta) { 
		
		String charSequence = "";
		int numMatches = 0;
		int searchResult;

		charSequence += this.theBoard[baseRow][baseCol];
		
		for(int i = baseRow + rowDelta, j = baseCol + colDelta; i <= 0 && j>= 0 && i < rows && j < columns; i+= rowDelta, j+= colDelta) { 
			charSequence += theBoard[i][j];
			searchResult = prefixSearch(theWords, charSequence);
			
			if(searchResult == theWords.length) { 
				break;
			}
			
			if(!((String)theWords[searchResult]).startsWith(charSequence)) { 
				break;
			}
			
			if(theWords[searchResult].equals(charSequence)) { 
				numMatches++;
				System.out.println(String.format("Found \"%s\" at (%d, %d) to (%d, %d)", charSequence,baseRow, baseCol, i, j));
			}
			
		}
		
		return numMatches;
	}

}
