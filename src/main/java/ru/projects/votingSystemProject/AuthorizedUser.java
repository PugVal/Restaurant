package ru.projects.votingSystemProject;

import static ru.projects.votingSystemProject.model.User.VOTES_PER_DAY;

public class AuthorizedUser
{
    private static int id;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        AuthorizedUser.id = id;
    }

    public static int getVotesPerday ()
    {
        return VOTES_PER_DAY;
    }
}
