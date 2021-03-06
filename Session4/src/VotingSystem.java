import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList = new ArrayList<>();

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void createVoting(String question, int type, ArrayList<String> polls) {
        Voting voting = new Voting(type, question);
        for (String poll : polls) {
            voting.createPoll(poll);
        }
        votingList.add(voting);
    }

    public void vote(int voting, Person person, ArrayList<String> polls) {
        votingList.get(voting).vote(person, polls);
    }

    public void getVoting(int voting) {
        System.out.println(votingList.get(voting).getQuestion());
        int i=1;
        for (String poll : votingList.get(voting).getPolls().keySet()) {
            System.out.println(i+":"+poll);
            i++;

        }
    }
    public void getResult(int voting){
        System.out.println("Result:");
        votingList.get(voting).printVotes();
    }
}
