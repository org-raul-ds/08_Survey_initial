package es.uniovi.ds.lab.survey;

public class Survey {

    private String question;
    private int yes, no;

    public Survey(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public int getYesVotes() {
        return yes;
    }

    public int getNoVotes() {
        return no;
    }

    public void addYesVote() {
        yes++;
        updatePieChart();
        updateBarChart();
        backupData();
    }

    public void addNoVote() {
        no++;
        updatePieChart();
        updateBarChart();
        backupData();
    }

    // Showing data in different ways and saving it

    private void updatePieChart() {
        System.out.printf("Here is where the pie chart would be drawn. 'Yes' sector: %d, 'No' sector: %d%n",
                yes, no);
    }

    private void updateBarChart() {
        System.out.printf("Here is where the bar chart would be drawn. 'Yes' bar: %d, 'No' bar: %d%n", yes, no);
    }

    private void backupData() {
        System.out.printf("Here is where the data would be saved to disk/DB. 'Yes' count: %d, 'No' count: %d%n", yes,
                no);
    }

}
