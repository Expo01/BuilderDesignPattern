public class ExerciseProgram {
    private String shoulderExercise;
    private String chest;
    private String core;
    private String legs;
    private String aerobic;
    private String mobility;

   private ExerciseProgram(String shoulderExercise, String chest, String core,
                           String legs, String aerobic, String mobility) {
        this.shoulderExercise = shoulderExercise;
        this.chest = chest;
        this.core = core;
        this.legs = legs;
        this.aerobic = aerobic;
        this.mobility = mobility;
    }


    ////////////////

    public static class ProgramBuilder {
        private String shoulderExercise;
        private String chest;
        private String core;
        private String legs;
        private String aerobic;
        private String mobility;

        public void ShoulderExercise(String shoulderExercise) {
            this.shoulderExercise = shoulderExercise;
        }

        public void Chest(String chest) {
            this.chest = chest;
        }

        public void Core(String core) {
            this.core = core;
        }

        public void Legs(String legs) {
            this.legs = legs;
        }

        public void Aerobic(String aerobic) {
            this.aerobic = aerobic;
        }

        public void Mobility(String mobility) {
            this.mobility = mobility;
        }

        public ExerciseProgram build(){
            return new ExerciseProgram(shoulderExercise,chest,core,legs,aerobic,mobility);
        }
    }


}