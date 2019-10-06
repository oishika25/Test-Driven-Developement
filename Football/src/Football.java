import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Football {

	public ArrayList<String[]> data = new ArrayList<String[]>();

	public void load_data() {

		try {
			FileReader fileReader = new FileReader("football.dat");

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;

			line = bufferedReader.readLine();
			while ((line = bufferedReader.readLine()) != null) {
				String[] arrOfStr = line.trim().split("\\s+");
				if (arrOfStr.length > 2)
					data.add(arrOfStr);
			}

			bufferedReader.close();
		}

		catch (FileNotFoundException ex) {
			System.out.println("Unable to open file");
		} catch (IOException ex) {
			System.out.println("Error reading file");
		}
	}

	public int get_for(int team_number) {
		String temp = data.get(team_number - 1)[6];
		temp = temp.replaceAll("[^\\d]", "");
		return Integer.parseInt(temp);
	}

	public int get_against(int team_number) {
		String temp = data.get(team_number - 1)[8];
		temp = temp.replaceAll("[^\\d]", "");
		return Integer.parseInt(temp);
	}

	public int get_for_against_difference(int team_number) {
		return Math.abs(get_for(team_number) - get_against(team_number));
	}

	public String get_team_with_smallest_difference() {
		int min_diff = 100;
		String result = "";
		for (String[] row : data) {
			int team_number = Integer.parseInt(row[0].replaceAll("[^\\d]", ""));
			int diff = get_for_against_difference(team_number);
			if (diff < min_diff) {
				result = row[1];
				min_diff = diff;
			}
		}
		return result;
	}
}
