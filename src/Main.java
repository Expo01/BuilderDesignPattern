public class Main {
    public static void main(String[] args) {
        // ExerciseProgram illegal = new ExerciseProgram("no", "no", "no", "no", "no", "no");
        // I made ProgramBuilder an inner builder class of ExerciseProgram. Exercise program
        // has a private constructor which the inner build has access to but the main class
        // does not. main class accesses the private ExerciseProgram constructor through the public
        // build() instance method and effectively creates a pointer of class ExerciseProgram for
        // that ExerciseProgram object

        ExerciseProgram.ProgramBuilder buildLiftBro = new ExerciseProgram.ProgramBuilder();
        buildLiftBro.Legs("squats");
        buildLiftBro.Chest("bench");
        buildLiftBro.ShoulderExercise("overhead press");
        ExerciseProgram liftBro = buildLiftBro.build();


        ExerciseProgram.ProgramBuilder buildBendyGirl = new ExerciseProgram.ProgramBuilder();
        buildBendyGirl.Aerobic("stair stepper");
        buildBendyGirl.Mobility("yoga");
        buildBendyGirl.Core("Pilates");
        ExerciseProgram bendyGirl = buildBendyGirl.build();

    }
}