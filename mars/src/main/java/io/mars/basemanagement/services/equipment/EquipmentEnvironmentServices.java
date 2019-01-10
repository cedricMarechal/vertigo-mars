package io.mars.basemanagement.services.equipment;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import io.vertigo.core.component.Component;
import io.vertigo.database.timeseries.ClusteredMeasure;
import io.vertigo.database.timeseries.DataFilter;
import io.vertigo.database.timeseries.TabularDatas;
import io.vertigo.database.timeseries.TimeFilter;
import io.vertigo.database.timeseries.TimeSeriesDataBaseManager;
import io.vertigo.database.timeseries.TimedDatas;

public class EquipmentEnvironmentServices implements Component {
	private final String appName = "mars-test"; // TODO: add a param

	@Inject
	private TimeSeriesDataBaseManager timeSeriesDataBaseManager;

	public TimedDatas getTimeSeries(final List<String> measures, final DataFilter dataFilter, final TimeFilter timeFilter) {
		return timeSeriesDataBaseManager.getTimeSeries(appName, measures, dataFilter, timeFilter);

	}

	public TimedDatas getClusteredTimeSeries(final ClusteredMeasure clusteredMeasure, final DataFilter dataFilter, final TimeFilter timeFilter) {
		return timeSeriesDataBaseManager.getClusteredTimeSeries(appName, clusteredMeasure, dataFilter, timeFilter);
	}

	public TimedDatas getTabularTimedData(final List<String> measures, final DataFilter dataFilter, final TimeFilter timeFilter, final String... groupBy) {
		return timeSeriesDataBaseManager.getTabularTimedData(appName, measures, dataFilter, timeFilter, groupBy);
	}

	public TabularDatas getTabularData(final List<String> measures, final DataFilter dataFilter, final TimeFilter timeFilter, final String... groupBy) {
		return timeSeriesDataBaseManager.getTabularData(appName, measures, dataFilter, timeFilter, groupBy);
	}

	public TabularDatas getTops(final String measure, final DataFilter dataFilter, final TimeFilter timeFilter, final String groupBy, final int maxRows) {
		return timeSeriesDataBaseManager.getTops(appName, measure, dataFilter, timeFilter, groupBy, maxRows);
	}

	public List<String> getTagValues(final String measurement, final String tag) {
		return timeSeriesDataBaseManager.getTagValues(appName, measurement, tag);
	}

	public Double getLastTemperature() {
		final TabularDatas lastTemperatures = timeSeriesDataBaseManager.getTabularData(
				"mars-test",
				Collections.singletonList("value:last"),
				DataFilter.builder("temperature").build(),
				TimeFilter.builder("now() - 1h", "now() + 1h").build());
		return Math.round((Double) lastTemperatures.getTabularDataSeries().get(0).getValues().get("value:last") * 10.0) / 10.0;
	}

	public Double getLastHumidity() {
		final TabularDatas lastHumidite = timeSeriesDataBaseManager.getTabularData(
				"mars-test",
				Collections.singletonList("value:last"),
				DataFilter.builder("humidite").build(),
				TimeFilter.builder("now() - 1h", "now() + 1h").build());
		return Math.round((Double) lastHumidite.getTabularDataSeries().get(0).getValues().get("value:last") * 10.0) / 10.0;
	}

	public Double getTotalTemperatureMeasured() {
		//a changer pour V2
		final TabularDatas totalMeasure = timeSeriesDataBaseManager.getTabularData(
				"mars-test",
				Collections.singletonList("value:count"),
				DataFilter.builder("temperature").build(),
				TimeFilter.builder("now() - 365d", "now() + 1h").build());
		return (double) Math.round((Double) totalMeasure.getTabularDataSeries().get(0).getValues().get("value:count") * 10) / 10;
	}

	public void sendBaseAlerte() {
		System.out.println("TODO RFELTEN");
	}
}
