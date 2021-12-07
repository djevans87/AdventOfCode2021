import java.util.ArrayList;
import java.util.List;

public class Day01 extends AOCPuzzle {
    public Day01() {
        super("1");
    }

    @Override
    void solve(List<String> input) {
        List<Integer> depths = convertToInts(input);

        //PART 1
        List<Integer> windows = new ArrayList<>();
        int changes = 0;
        for (int i = 1; i < depths.size(); i++)
            if (depths.get(i - 1) < depths.get(i))
                changes++;

        lap(changes);
//Part 2
        int numberOfIncreases = 0;
        for (int i = 3; i < input.size(); i++)
            numberOfIncreases += depths.get(i) > depths.get(i-3) ? 1:0;
        lap(numberOfIncreases);

    }
}
