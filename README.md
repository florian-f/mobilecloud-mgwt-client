#mobilecloud-mgwt-client

This is a simple mobile client for the video service created in Dr. White's class 
[Programming Cloud Services for Android Handheld Systems](https://class.coursera.org/mobilecloud-001)

It uses [mgwt](https://github.com/mgwt) and is based on the [mgwt showcase](https://github.com/mgwt/mgwt.showcase)


Note: I only tested this with example 5-VideoControllerWithJpa

Because I don't want to serve the app from the same server as the video service right now, and I did not want to use JSONP, I decided that the easiest solution was to [enable CORS in the video service](https://github.com/florian-f/mobilecloud-14/tree/cors_filter_for_ajax_client)


