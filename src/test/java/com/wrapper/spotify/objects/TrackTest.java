package com.wrapper.spotify.objects;

import com.wrapper.spotify.TestUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrackTest {
  @Test
  public void shouldCreateTrack() throws Exception {
    Track track = new Track.JsonUtil().createModelObject(TestUtil.readTestData("track.json"));
    assertEquals("0eGsygTp906u18L0Oimnem", track.getId());
  }

//  @Test
//  public void shouldCreateSeveralTracks() throws Exception {
//    Track[] tracks = new Track.JsonUtil().createModelObjectArray(TestUtil.readTestData("track.json"));
//    assertEquals(2, tracks.length);
//  }
}