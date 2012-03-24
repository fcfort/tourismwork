package com.opentravelsoft.service.resource;

import java.util.List;

import com.opentravelsoft.util.LabelValueBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opentravelsoft.entity.Destination;
import com.opentravelsoft.entity.District;
import com.opentravelsoft.entity.Plan;
import com.opentravelsoft.providers.DestinationDao;
import com.opentravelsoft.providers.DistrictDao;
import com.opentravelsoft.providers.mixed.PlanListDao;

@Service("CategoryService")
public class DestinationServiceImpl implements DestinationService {
  private DestinationDao destinationDao;

  private DistrictDao districtDao;

  private DestinationDao categoryDao;

  private PlanListDao planListDao;

  @Autowired
  public void setCategoryDao(DestinationDao categoryDao) {
    this.categoryDao = categoryDao;
  }

  @Autowired
  public void setPlanListDao(PlanListDao planListDao) {
    this.planListDao = planListDao;
  }

  @Autowired
  public void setDistrictDao(DistrictDao destinationDao) {
    this.districtDao = destinationDao;
  }

  @Autowired
  public void setDestinationDao(DestinationDao categoryDao) {
    this.destinationDao = categoryDao;
  }

  public List<Destination> roGetAllCategorys() {
    return destinationDao.getAllDestination();
  }

  public Destination roGetCategory(long destId) {
    return destinationDao.get(destId);
  }

  public void txSaveCategory(Destination category) {
    destinationDao.save(category);
  }

  public int txDelCategorys(long catId) {
    return destinationDao.delDestination(catId);
  }

  public List<Destination> getCategirys() {
    return destinationDao.getAllDestination();
  }

  public List<District> getDistrictByRegion(String countryNo, String provinceNo) {
    return districtDao.getDistrictList(null, countryNo, provinceNo);

  }

  public List<List<LabelValueBean>> getRegionGroupList() {
    return categoryDao.getRegionGroupList();
  }

  public List<Plan> getPlanList(String region, boolean deadline) {
    return planListDao.getPlanList(0L, deadline, region);
  }

  public List<List<LabelValueBean>> roGetSubRegions(String regionId) {
    return categoryDao.getSubRegions(regionId);
  }

  public List<Destination> getRegionList() {
    return categoryDao.getRegionList();
  }
}