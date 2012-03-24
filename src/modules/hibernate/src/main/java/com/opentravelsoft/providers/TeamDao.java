package com.opentravelsoft.providers;

import java.util.List;

import com.opentravelsoft.common.TeamType;
import com.opentravelsoft.entity.Team;
import com.opentravelsoft.util.PaginationSupport;

public interface TeamDao extends GenericDao<Team, Long> {

  public List<Team> getTeam(long userId, TeamType type);

  public PaginationSupport getTeamList(int fromRecord, int pageSize);

  public List<Team> getTeamList(TeamType type);

}