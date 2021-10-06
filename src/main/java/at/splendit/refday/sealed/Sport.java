package at.splendit.refday.sealed;

sealed class Sport 
	implements OlympicGame 
	permits WaterSport, BallSport, FightingSport {}

final class FightingSport extends Sport {}

sealed class BallSport extends Sport 
	permits FootBall, VolleyBall {}

non-sealed class WaterSport extends Sport {}


