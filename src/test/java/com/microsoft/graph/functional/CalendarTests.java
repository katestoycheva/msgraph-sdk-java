package com.microsoft.graph.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.ICalendarCollectionPage;
import com.microsoft.graph.requests.extensions.IEventCollectionPage;

//@Ignore
public class CalendarTests {
	IGraphServiceClient graphServiceClient = null;

	@Before
	public void setUp() {
		TestBase testBase = new TestBase();
		graphServiceClient = testBase.graphClient;
	}

	@Test
	public void testTimeOff() {
		String actual = graphServiceClient.teams("teamId").schedule().timeOffRequests().getRequestUrl();
		String expected = "https://graph.microsoft.com/v1.0/teams/teamId/schedule/timeOffRequests";
		assertEquals("The generated client url does not match the expected url for the list time off request api ", actual, expected);
	}

	///teams/{teamId}/schedule/timeOffRequests

	@Test
	public void getMeCalendars() {
		//GET me/calendars
		ICalendarCollectionPage calendarCollectionPage = graphServiceClient.me().calendars().buildRequest().get();
		assertNotNull(calendarCollectionPage);
	}

	@Test
	public void getMeCalendarsview() {
		//GET me/calendarview
		QueryOption q1 = new QueryOption("startDateTime", "2015-11-08T19:00:00.0000000");
		QueryOption q2 = new QueryOption("endDateTime", "2018-12-25T20:00:00.0000000");
		List<Option> list = new ArrayList<>();
		list.add(q1);
		list.add(q2);
		IEventCollectionPage collectionPage = graphServiceClient.me().calendarView().buildRequest(list).get();
		assertNotNull(collectionPage);
	}

	@Test
	public void meCalendarKeyCalendarviewTest() {
		//GET me/calendars('<key>')/calendarview
		QueryOption q1 = new QueryOption("startDateTime", "2015-11-08T19:00:00.0000000");
		QueryOption q2 = new QueryOption("endDateTime", "2018-12-25T20:00:00.0000000");
		List<Option> list = new ArrayList<>();
		list.add(q1);
		list.add(q2);
		ICalendarCollectionPage calendarCollectionPage = graphServiceClient.me().calendars().buildRequest().get();
		assertNotNull(calendarCollectionPage);
		if(calendarCollectionPage.getCurrentPage().size() > 0)
			graphServiceClient.me().calendars(calendarCollectionPage.getCurrentPage().get(0).id).calendarView().buildRequest(list).get();
	}

	@Test
	public void meCalendartest() {
		//GET me/calendar
		Calendar calendar = graphServiceClient.me().calendar().buildRequest().get();
		assertNotNull(calendar);
	}
}
