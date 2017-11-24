function dist = greatCircle(lat1, long1, lat2, long2)
	dLat = lat1 - lat2;
	dLong = long1 - long2;
	dSigma = atan2(sqrt(((cos(lat2) * sin(dLong)).^2) + ((cos(lat1) * sin(lat2)) - ((sin(lat1) * cos(lat2) * cos(dLong))).^2))/((sin(lat1) * sin(lat2)) + (cos(lat1) * cos(lat2) * cos(dLong))));
	dist = 6371 * dSigma; %earth average radius multiplied by the angle between the two points (calclated last line);
end