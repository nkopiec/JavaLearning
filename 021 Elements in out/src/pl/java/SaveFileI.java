package pl.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveFileI {
	public static void main(String[] args) {
		while(true)
		{
		    try {

		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String s = br.readLine();

		        Object testFile = 3;
				switch(s)
		        {

		        case "0":
		            System.out.append("\nOpcja 0:Utworzenie folderu: c:JavaIOTest: \n");
		            FileIOJava.CreateFolder("c:\\JavaIOTest\\");

		            break;
		        case "1":
		            System.out.append("\nOpcja 1:Tworznie pliku:\n");
		            FileIOJava.CreateFolder(testFile);
		            break;
		        case "2":
		            System.out.append("\nOpcja 2: Sprawdzenie pliku:\n");
		            FileIOJava.CheckIfFileExist(testFile);
		            break;
		        case "3":
		            System.out.append("\nOpcja 3: Sprawdzenie rozmiaru :\n");
		            FileIOJava.CheckSize(testFile);
		        case "4":
		            System.out.append("\nOpcja 4: Skasuj plik :\n");
		            FileIOJava.DeleteFile(testFile);
		            break;
		        case "5":
		            System.out.append("\nOpcja 5: Zmiana nazwy pliku :\n");
		            FileIOJava.RenameFile(testFile,"c:\\JavaIOTest\\testNEW.txt");
		            break;
		        case "6":
		            System.out.append("\nOpcja 6: Przygotowania do opcji 7 :\n");
		            FileIOJava.CreateFolder("c:\\JavaIOTest\\folder_A\\");
		            FileIOJava.CreateFolder("c:\\JavaIOTest\\folder_B\\");
		            FileIOJava.CreateFolder("c:\\JavaIOTest\\folder_C\\");
		            FileIOJava.CreateFileForTest("c:\\JavaIOTest\\folder_A\\test_Afile.txt");
		            FileIOJava.CreateFileForTest("c:\\JavaIOTest\\folder_B\\test_Bfile.txt");
		            break;
		        case "7":
		            System.out.append("\nOpcja 7: Kopiowanie pliku mo¿e go zastapic:\n");
		            FileIOJava.CopyFile("c:\\JavaIOTest\\folder_A\\test_Afile.txt",
		                    "c:\\JavaIOTest\\folder_B\\test_Bfile.txt");
		            break;
		        case "8":
		            System.out.append("\nOpcja 8: Przeniesienie do innego folderu ZMIEN NAZWE:\n");
		            MoveFileToDirectory_RenameMethod("c:\\JavaIOTest\\test.txt","c:\\JavaIOTest\\folder_C");
		            //jesli folderu "C" nie ma to plik zniknie 
		            break;
		        case "9":
		            System.out.append("\nOpcja 9: Przeniesienie do innego folderu KOPIUJ/KASUJ:\n");
		            FileIOJava.MoveFileToDirectory_CopyDelete("c:\\JavaIOTest\\folder_A\\test_Afile.txt",
		                    "c:\\JavaIOTest\\folder_C\\test_Afile.txt");
		            break;
		        case "10":
		            System.out.append("\nOpcja 10: Plik tylko do odczytu:\n");
		            MakeFileReadOnly("c:\\JavaIOTest\\test.txt");
		            break;
		        case "11":
		            System.out.append("Opcja 11: Okresl sciezke do pliku ;x; ");
		            GetFilePath();
		            break;
		        case "12":
		            System.out.append("Opcja 12: Zapisz do pliku BufferedWriter");
		            SaveFile_BufferedWriter("C:\\JavaIOTest\\BufferedWriter_test.txt");
		            break;
		        case "13":
		            System.out.append(" Opcja 13: Zapisz do pliku FileOutputStream");
		            SaveFile_FileOutputStreamExample2("C:\\JavaIOTest\\FileOutputStream_test.txt");
		            break;
		        case "14":
		            System.out.append("Opcja 14: Odczyt z pliku BufferReader");
		            String test = OpenFile_BufferReaderExample2("C:\\JavaIOTest\\BufferedWriter_test.txt");
		            break;
		        case "15":
		            System.out.append("Opcja 15: Odczyt z pliku FileInput");
		            String test2 = OpenFile_FileInputStream2("C:\\JavaIOTest\\FileOutputStream_test.txt");
		            break;
		        case "16":
		            System.out.append("Opcja 16: Dodanie tekstu do istniejacego pliku");
		            AppendTextToFile("C:\\JavaIOTest\\FileOutputStream_test.txt");
		            AppendTextToFile("C:\\JavaIOTest\\BufferedWriter_test.txt");
		            break;

		        }

		    } catch (IOException e) {
		        // TODO Auto-generated catch block e.printStackTrace();
		    }
		}
	}

	private static void AppendTextToFile(String string) {
		// TODO Auto-generated method stub
		
	}

	private static String OpenFile_FileInputStream2(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String OpenFile_BufferReaderExample2(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void SaveFile_FileOutputStreamExample2(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void SaveFile_BufferedWriter(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void GetFilePath() {
		// TODO Auto-generated method stub
		
	}

	private static void MakeFileReadOnly(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void MoveFileToDirectory_RenameMethod(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}
