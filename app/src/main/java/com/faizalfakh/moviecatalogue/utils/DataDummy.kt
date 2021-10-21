package com.faizalfakh.moviecatalogue.utils

import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.data.source.remote.response.GenreResponse
import com.faizalfakh.moviecatalogue.data.source.remote.response.MovieResponse
import com.faizalfakh.moviecatalogue.data.source.remote.response.TVResponse

object DataDummy {
    fun generateMovies(): List<DataEntity> {
        val data = ArrayList<DataEntity>()

        data.add(
            DataEntity(
                    id = 1,
                    title = "Alita: Battle Angel (2019)",
                    genres = listOf("Action", "Science Fiction", "Adventure"),
                    duration = 122,
                    rating = 7.1f,
                    description = "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 2,
                    title = "Aquaman (2018)",
                    genres = listOf("Action", "Adventure", "Fantasy"),
                    duration = 144,
                    rating = 6.9f,
                    description = "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 3,
                    title = "Bohemian Rhapsody (2018)",
                    genres = listOf("Music", "Drama"),
                    duration = 135,
                    rating = 8.0f,
                    description = "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 4,
                    title = "Cold Pursuit (2019)",
                    genres = listOf("Action", "Crime", "Thriller"),
                    duration = 119,
                    rating = 5.6f,
                    description = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/cO802woIgZsLbOWPUSsleobKyDp.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 5,
                    title = "Fantastic Beasts: The Crimes of Grindelwald (2018)",
                    genres = listOf("Adventure", "Fantasy", "Drama"),
                    duration = 134,
                    rating = 6.9f,
                    description = "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 6,
                    title = "Mortal Engines (2018)",
                    genres = listOf("Adventure", "Fantasy"),
                    duration = 129,
                    rating = 6.1f,
                    description = "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 7,
                    title = "Avengers: Infinity War (2018)",
                    genres = listOf("Adventure", "Action", "Science Fiction"),
                    duration = 149,
                    rating = 8.3f,
                    description = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 8,
                    title = "Ralph Breaks the Internet (2018)",
                    genres = listOf("Family", "Animation", "Comedy", "Adventure"),
                    duration = 112,
                    rating = 7.2f,
                    description = "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qEnH5meR381iMpmCumAIMswcQw2.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 9,
                    title = "Serenity (2019)",
                    genres = listOf("Thriller", "Mystery", "Drama"),
                    duration = 102,
                    rating = 5.4f,
                    description = "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 10,
                    title = "Spider-Man: Into the Spider-Verse (2018)",
                    genres = listOf("Action", "Adventure", "Animation", "Science Fiction", "Comedy"),
                    duration = 117,
                    rating = 8.4f,
                    description = "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \" Kingpin \" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg"
            )
        )
        data.add(
            DataEntity(
                    id = 11,
                    title = "T-34 (2018)",
                    genres = listOf("War", "Action", "Drama", "History"),
                    duration = 139,
                    rating = 6.8f,
                    description = "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                    image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/jqBIHiSglRfNxjh1zodHLa9E7zW.jpg"
            )
        )
        return data
    }

    fun generateTvShow(): List<DataEntity> {
        val data = ArrayList<DataEntity>()

        data.add(
                DataEntity(
                        id = 1,
                        title = "Arrow (2012)",
                        genres = listOf("Crime", "Drama", "Mystery", "Action & Adventure"),
                        duration = 42,
                        rating = 6.5f,
                        description = "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg"
                )
        )
        data.add(
                DataEntity(
                        id = 2,
                        title = "Doom Patrol (2019)",
                        genres = listOf("Sci-Fi & Fantasy", "Action & Adventure"),
                        duration = 49,
                        rating = 7.6f,
                        description = "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/drlfSCIlMKrEeMPhi8pqY4xGxj.jpg"
                )
        )
        data.add(
                DataEntity(
                        id = 3,
                        title = "Dragon Ball (1986)",
                        genres = listOf("Sci-Fi & Fantasy", "Animation", "Action & Adventure"),
                        duration = 25,
                        rating = 8.0f,
                        description = "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/tZ0jXOeYBWPZ0OWzUhTlYvMF7YR.jpg"
                )
        )
        data.add(
                DataEntity(
                        id = 4,
                        title = "The Flash (2014)",
                        genres = listOf("Drama", "Sci-Fi & Fantasy"),
                        duration = 44,
                        rating = 7.6f,
                        description = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
                )
        )
        data.add(
                DataEntity(
                        id = 5,
                        title = "Hanna (2019)",
                        genres = listOf("Action & Adventure", "Drama"),
                        duration = 50,
                        rating = 7.4f,
                        description = "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/iYUtjx1EN4SVTgxd2TB4cZTGSQb.jpg"
                )
        )
        data.add(
                DataEntity(
                        id = 6,
                        title = "Naruto Shippūden (2007)",
                        genres = listOf("Animation", "Comedy", "Drama"),
                        duration = 25,
                        rating = 8.6f,
                        description = "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg"
                )
        )
        data.add(
                DataEntity(
                        id = 7,
                        title = "Riverdale (2017)",
                        genres = listOf("Drama", "Mystery"),
                        duration = 45,
                        rating = 8.6f,
                        description = "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg"
                )
        )
        data.add(
                DataEntity(
                        id = 8,
                        title = "Supergirl (2015)",
                        genres = listOf("Action", "Adventure", "Drama", "Science Fiction"),
                        duration = 42,
                        rating = 7.1f,
                        description = "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4ka8vAzAFUZFKxWyfGfwVcSXuZo.jpg"
                )
        )
        data.add(
                DataEntity(
                        id = 9,
                        title = "Supernatural (2005)",
                        genres = listOf("Drama", "Mystery", "Sci-Fi & Fantasy"),
                        duration = 45,
                        rating = 8.1f,
                        description = "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. ",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg"
                )
        )
        data.add(
                DataEntity(
                        id = 10,
                        title = "The Simpsons (1989) ",
                        genres = listOf("Animation", "Comedy", "Family", "Drama"),
                        duration = 22,
                        rating = 7.8f,
                        description = "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                        image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg"
                )
        )
        return data
    }

    fun generateRemoteMovies(): List<MovieResponse> {
        val data = ArrayList<MovieResponse>()

        data.add(
            MovieResponse(
                id = 1,
                title = "Alita: Battle Angel (2019)",
                genres = listOf(12, 16, 25),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 122,
                rating = 7.1f,
                description = "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 2,
                title = "Aquaman (2018)",
                genres = listOf(3, 8),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 144,
                rating = 6.9f,
                description = "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 3,
                title = "Bohemian Rhapsody (2018)",
                genres = listOf(10, 34),
                duration = 135,
                genreDetail = listOf(GenreResponse(12, "Action")),
                rating = 8.0f,
                description = "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 4,
                title = "Cold Pursuit (2019)",
                genres = listOf(20, 31),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 119,
                rating = 5.6f,
                description = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/cO802woIgZsLbOWPUSsleobKyDp.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 5,
                title = "Fantastic Beasts: The Crimes of Grindelwald (2018)",
                genres = listOf(10, 14, 31),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 134,
                rating = 6.9f,
                description = "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 6,
                title = "Mortal Engines (2018)",
                genres = listOf(20, 24, 34),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 129,
                rating = 6.1f,
                description = "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 7,
                title = "Avengers: Infinity War (2018)",
                genres = listOf(3, 9, 10),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 149,
                rating = 8.3f,
                description = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 8,
                title = "Ralph Breaks the Internet (2018)",
                genres = listOf(12, 14 , 16),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 112,
                rating = 7.2f,
                description = "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qEnH5meR381iMpmCumAIMswcQw2.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 9,
                title = "Serenity (2019)",
                genres = listOf(9, 14),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 102,
                rating = 5.4f,
                description = "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 10,
                title = "Spider-Man: Into the Spider-Verse (2018)",
                genres = listOf(32, 2),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 117,
                rating = 8.4f,
                description = "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \" Kingpin \" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg"
            )
        )
        data.add(
            MovieResponse(
                id = 11,
                title = "T-34 (2018)",
                genres = listOf(2, 4, 10),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = 139,
                rating = 6.8f,
                description = "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/jqBIHiSglRfNxjh1zodHLa9E7zW.jpg"
            )
        )
        return data
    }

    fun generateRemoteTvShow(): List<TVResponse> {
        val data = ArrayList<TVResponse>()

        data.add(
            TVResponse(
                id = 1,
                title = "Arrow (2012)",
                genres = listOf(12, 34, 23),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = listOf(42),
                rating = 6.5f,
                description = "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg"
            )
        )
        data.add(
            TVResponse(
                id = 2,
                title = "Doom Patrol (2019)",
                genres = listOf(12, 14),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = listOf(49),
                rating = 7.6f,
                description = "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/drlfSCIlMKrEeMPhi8pqY4xGxj.jpg"
            )
        )
        data.add(
            TVResponse(
                id = 3,
                title = "Dragon Ball (1986)",
                genres = listOf(20, 25, 34),
                genreDetail = listOf(GenreResponse(14, "Animation")),
                duration = listOf(25),
                rating = 8.0f,
                description = "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/tZ0jXOeYBWPZ0OWzUhTlYvMF7YR.jpg"
            )
        )
        data.add(
            TVResponse(
                id = 4,
                title = "The Flash (2014)",
                genres = listOf(12, 4),
                genreDetail = listOf(GenreResponse(12, "Action")),
                duration = listOf(44),
                rating = 7.6f,
                description = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
            )
        )
        data.add(
            TVResponse(
                id = 5,
                title = "Hanna (2019)",
                genres = listOf(2, 10),
                genreDetail = listOf(GenreResponse(2, "Family")),
                duration = listOf(30),
                rating = 7.4f,
                description = "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/iYUtjx1EN4SVTgxd2TB4cZTGSQb.jpg"
            )
        )
        data.add(
            TVResponse(
                id = 6,
                title = "Naruto Shippūden (2007)",
                genres = listOf(12, 14),
                genreDetail = listOf(GenreResponse(14, "Animation")),
                duration = listOf(25),
                rating = 8.6f,
                description = "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg"
            )
        )
        data.add(
            TVResponse(
                id = 7,
                title = "Riverdale (2017)",
                genres = listOf(9, 12),
                genreDetail = listOf(GenreResponse(9, "Misery")),
                duration = listOf(30),
                rating = 8.6f,
                description = "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg"
            )
        )
        data.add(
            TVResponse(
                id = 8,
                title = "Supergirl (2015)",
                genres = listOf(20, 14, 20),
                genreDetail = listOf(GenreResponse(20, "Adventure")),
                duration = listOf(42),
                rating = 7.1f,
                description = "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4ka8vAzAFUZFKxWyfGfwVcSXuZo.jpg"
            )
        )
        data.add(
            TVResponse(
                id = 9,
                title = "Supernatural (2005)",
                genres = listOf(9, 10, 24),
                genreDetail = listOf(GenreResponse(9, "Misery")),
                duration = listOf(45),
                rating = 8.1f,
                description = "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. ",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg"
            )
        )
        data.add(
            TVResponse(
                id = 10,
                title = "The Simpsons (1989) ",
                genres = listOf(2, 4, 10, 25),
                genreDetail = listOf(GenreResponse(14, "Animation")),
                duration = listOf(25),
                rating = 7.8f,
                description = "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                image = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg"
            )
        )
        return data
    }
}