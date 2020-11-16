import React from 'react'; 
import { makeStyles } from '@material-ui/core/styles';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import Box from '@material-ui/core/Box';
import { Container, Grid } from '@material-ui/core';
// import Container from '@material-ui/core/Container';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardMedia from '@material-ui/core/CardMedia';
import CardContent from '@material-ui/core/CardContent';
import Avatar from '@material-ui/core/Avatar';
// import BookmarkIcon from '@material-ui/icons/Bookmark';
import BookmarkBorderIcon from '@material-ui/icons/BookmarkBorder';
import './Nutrition.css'

const useStyles = makeStyles((theme) => ({
  appBar: {
        backgroundColor: "#fff"
      },
      hero: {
        backgroundImage: `url('https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80')`,
        height: "500px",
        backgroundPosition: "center",
        backgroundRepeat: "no-repeat",
        backgroundSize: "cover",
        position: "relative",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        color: "#fff",
        fontSize: "4rem",
        [theme.breakpoints.down("sm")]: {
          height: 300,
          fontSize: "3em"
        }
      },
      blogsContainer: {
        paddingTop: theme.spacing(3)
      }, 
      blogTitle: {
        fontWeight: 800, 
        paddingBottom: theme.spacing(3)
      },
      card: {
        maxWidth: "100%", 
      },
      media: {
        height: 320
      }, 
      CardActions: {
        display: "flex",
        margin: "0 10px", 
        justifyContent: "space-between"
      },
      author: {
        display: "flex"
      }
}));

function Nutrition() {
  const classes = useStyles();
  return (
    <div className="App">
      {/* <AppBar className={classes.appBar} position="static">
        <Toolbar>
          <Typography variant="h6" color="primary" text-align="center" font-style='Times New Roman'>
            Dog Nutrition
          </Typography>
        </Toolbar>
      </AppBar> */}

      <Box className={classes.hero}>
        <Box></Box>
      </Box>


      <Container maxWidth="lg" className={classes.blogsContainer}>
        <Typography variant="h4" className={classes.blogTitle} >
          Articles
        </Typography>

        <Grid container spacing={3} >
          <Grid item xs={12} sm={6} md={6}>
          <Card className={classes.card}>
            <CardActionArea>
              <CardMedia
                className={classes.media}
                image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/09/iStock-1160558300.jpg"
                title="Contemplative Reptile"
              />
              <CardContent>

              <Typography gutterBottom variant="h5" component="h2">
              What to Feed when ..
              </Typography>

              <Typography variant="body2" color="textSecondary" component="p">
              When a dog experiences loose stools, a pet parent realizes what to feed a dog with diarrhea is essential. 
              While the gastrointestinal system receives and processes food, the symptoms of GI distress can painfully manifest in a dog.  
              </Typography>
            </CardContent>
            </CardActionArea>
            <CardActions className={classes.CardActions}>
              <Box className={classes.author}>
                <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                <Box ml={2}>
                  <Typography variant="subtitle2" component="p">
                  Reading Time: 2 mins, 37 secs.
                  </Typography>
                  <Typography variant="subtitle2" color="textSecondary" component="p">
                    November 13th, 2020
                  </Typography>
                </Box>
              </Box>
              <Box>
                  <BookmarkBorderIcon />
              </Box>
            </CardActions>
          </Card>
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
          <Card className={classes.card}>
            <CardActionArea>
              <CardMedia
                className={classes.media}
                image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/09/iStock-1150603291-768x512.jpg"
                title="Contemplative Reptile"
              />
              <CardContent>

              <Typography gutterBottom variant="h5" component="h2">
              Dog Won’t Eat
              </Typography>

              <Typography variant="body2" color="textSecondary" component="p">
              Whenever a canine experiences appetite loss, it makes pet parents wonder at the same time, 
              “Why won’t my dog eat?” Firstly, the onset of anorexia, or appetite loss, is notably the most common sign of illness in a dog. 
              </Typography>
            </CardContent>
            </CardActionArea>
            <CardActions className={classes.CardActions}>
              <Box className={classes.author}>
                <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                <Box ml={2}>
                  <Typography variant="subtitle2" component="p">
                  Reading Time: 6 mins, 51 secs.
                  </Typography>
                  <Typography variant="subtitle2" color="textSecondary" component="p">
                  November 13th, 2020
                  </Typography>
                </Box>
              </Box>
              <Box>
                  <BookmarkBorderIcon />
              </Box>
            </CardActions>
          </Card>
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
          <Card className={classes.card}>
            <CardActionArea>
              <CardMedia
                className={classes.media}
                image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/04/Can-dogs-eat-pears.png"
                title="Contemplative Reptile"
              />
              <CardContent>

              <Typography gutterBottom variant="h5" component="h2">
              Can Dogs Eat Pears?
              </Typography>

              <Typography variant="body2" color="textSecondary" component="p">
              Pears are a delicious low-calorie snack for pet parents but can dogs eat pears? 
              The truth is pears are a healthy treat for a dog when prepared properly, and packed with vitamin A, C and soluble fiber. 
              </Typography>
            </CardContent>
            </CardActionArea>
            <CardActions className={classes.CardActions}>
              <Box className={classes.author}>
                <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                <Box ml={2}>
                  <Typography variant="subtitle2" component="p">
                  Reading Time: 4 mins, 51 secs.
                  </Typography>
                  <Typography variant="subtitle2" color="textSecondary" component="p">
                  November 13th, 2020
                  </Typography>
                </Box>
              </Box>
              <Box>
                  <BookmarkBorderIcon />
              </Box>
            </CardActions>
          </Card>      
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
              <Card className={classes.card}>
                <CardActionArea>

                    <CardMedia
                      className={classes.media}
                      image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/05/How-much-to-feed-a-puppy-01.jpg"
                      title="Contemplative Reptile"
                    />
                    <CardContent>

                        <Typography gutterBottom variant="h5" component="h2">
                            How Much To Feed A Puppy
                        </Typography>

                        <Typography variant="body2" color="textSecondary" component="p">
                        There’s a lot to plan for a puppy’s arrival. At the top of the list is how much to feed a puppy. 
                        Your puppy’s portions depend on his breed, weight, and age. Plan ahead and create a puppy feeding schedule that is consistent and meets his energy requirements. 
                        </Typography>

                    </CardContent>

                </CardActionArea>

                <CardActions className={classes.CardActions}>

                  <Box className={classes.author}>
                      <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                      <Box ml={2}>
                        <Typography variant="subtitle2" component="p">
                        Reading Time: 3 mins, 45 secs.
                        </Typography>
                        <Typography variant="subtitle2" color="textSecondary" component="p">
                        November 13th, 2020
                        </Typography>
                      </Box>
                  </Box>
                  
                  <Box>
                      <BookmarkBorderIcon />
                  </Box>
                </CardActions>
              </Card> 
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
              <Card className={classes.card}>
                <CardActionArea>

                    <CardMedia
                      className={classes.media}
                      image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/04/Can-dogs-eat-peaches.png"
                      title="Contemplative Reptile"
                    />
                    <CardContent>

                        <Typography gutterBottom variant="h5" component="h2">
                        Can Dogs Eat Peaches?
                        </Typography>

                        <Typography variant="body2" color="textSecondary" component="p">
                        If you’re thinking about sharing fruit with your dog this summer and wondering can dogs eat peaches, the answer is yes. 
                        The one exception of peaches for dogs is that the stone, or pit in the center, must be removed before serving. 
                        </Typography>

                    </CardContent>

                </CardActionArea>

                <CardActions className={classes.CardActions}>

                  <Box className={classes.author}>
                      <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                      <Box ml={2}>
                        <Typography variant="subtitle2" component="p">
                        Reading Time: 4 mins, 25 secs.
                        </Typography>
                        <Typography variant="subtitle2" color="textSecondary" component="p">
                        November 13th, 2020
                        </Typography>
                      </Box>
                  </Box>
                  
                  <Box>
                      <BookmarkBorderIcon />
                  </Box>
                </CardActions>
              </Card> 
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
              <Card className={classes.card}>
                <CardActionArea>

                    <CardMedia
                      className={classes.media}
                      image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/04/Dog-food-allergies_01.png"
                      title="Contemplative Reptile"
                    />
                    <CardContent>

                        <Typography gutterBottom variant="h5" component="h2">
                        What are Dog Food Allergies?
                        </Typography>

                        <Typography variant="body2" color="textSecondary" component="p">
                        Dog food allergies are an immune system reaction caused by specific proteins in dog diets. 
                        Food allergies are difficult to diagnose but often begin with common dog food allergy symptoms like a gastrointestinal disorder such as diarrhea or itching.
                        </Typography>

                    </CardContent>

                </CardActionArea>

                <CardActions className={classes.CardActions}>

                  <Box className={classes.author}>
                      <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                      <Box ml={2}>
                        <Typography variant="subtitle2" component="p">
                        Reading Time: 2 mins, 23 secs.
                        </Typography>
                        <Typography variant="subtitle2" color="textSecondary" component="p">
                        November 13th, 2020
                        </Typography>
                      </Box>
                  </Box>
                  
                  <Box>
                      <BookmarkBorderIcon />
                  </Box>
                </CardActions>
              </Card> 
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
              <Card className={classes.card}>
                <CardActionArea>

                    <CardMedia
                      className={classes.media}
                      image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/04/Raw-food-diet-for-dogs.png"
                      title="Contemplative Reptile"
                    />
                    <CardContent>

                        <Typography gutterBottom variant="h5" component="h2">
                       
                            Raw Food Diet for Dogs
                        </Typography>

                        <Typography variant="body2" color="textSecondary" component="p">
                        Feeding a raw food diet to your dog is often branded healthy, wholesome and even natural, 
                        but studies show that up to 50% of the commercial and homemade raw protein diets that were tested 
                        are contaminated.
                        </Typography>

                    </CardContent>

                </CardActionArea>

                <CardActions className={classes.CardActions}>

                  <Box className={classes.author}>
                      <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                      <Box ml={2}>
                        <Typography variant="subtitle2" component="p">
                        Reading Time: 5 mins, 30 secs.
                        </Typography>
                        <Typography variant="subtitle2" color="textSecondary" component="p">
                        November 13th, 2020
                        </Typography>
                      </Box>
                  </Box>
                  
                  <Box>
                      <BookmarkBorderIcon />
                  </Box>
                </CardActions>
              </Card> 
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
              <Card className={classes.card}>
                <CardActionArea>

                    <CardMedia
                      className={classes.media}
                      image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/03/Glucosamine-for-dogs.png"
                      title="Contemplative Reptile"
                    />
                    <CardContent>

                        <Typography gutterBottom variant="h5" component="h2">
                        What is Glucosamine for Dogs?
                        </Typography>

                        <Typography variant="body2" color="textSecondary" component="p">
                        Glucosamine for dogs is a supplement that supports cartilage, which is the tissue that provides smooth movement of the joints. 
                        Glucosamine nutraceuticals can help maintain joint mobility.
                        </Typography>

                    </CardContent>

                </CardActionArea>

                <CardActions className={classes.CardActions}>

                  <Box className={classes.author}>
                      <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                      <Box ml={2}>
                        <Typography variant="subtitle2" component="p">
                        Reading Time: 3 mins, 45 secs.
                        </Typography>
                        <Typography variant="subtitle2" color="textSecondary" component="p">
                        November 13th, 2020
                        </Typography>
                      </Box>
                  </Box>
                  
                  <Box>
                      <BookmarkBorderIcon />
                  </Box>
                </CardActions>
              </Card> 
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
              <Card className={classes.card}>
                <CardActionArea>

                    <CardMedia
                      className={classes.media}
                      image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/03/Fish-oil-for-dogs_01.png"
                      title="Contemplative Reptile"
                    />
                    <CardContent>

                        <Typography gutterBottom variant="h5" component="h2">
                        Fish Oil for Dogs and Puppies
                        </Typography>

                        <Typography variant="body2" color="textSecondary" component="p">
                        Fish oil for dogs is an excellent source of omega-3 fatty acids, 
                        which includes two essential components called EPA and DHA. Omega-3 for dogs, 
                        infused into many good quality dog food diets, is known to relieve inflammation.
                        </Typography>

                    </CardContent>

                </CardActionArea>

                <CardActions className={classes.CardActions}>

                  <Box className={classes.author}>
                      <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                      <Box ml={2}>
                        <Typography variant="subtitle2" component="p">
                        Reading Time: 2 mins, 37 secs.
                        </Typography>
                        <Typography variant="subtitle2" color="textSecondary" component="p">
                        November 13th, 2020
                        </Typography>
                      </Box>
                  </Box>
                  
                  <Box>
                      <BookmarkBorderIcon />
                  </Box>
                </CardActions>
              </Card> 
          </Grid>

          <Grid item xs={12} sm={6} md={6}>
              <Card className={classes.card}>
                <CardActionArea>

                    <CardMedia
                      className={classes.media}
                      image="https://d17fnq9dkz9hgj.cloudfront.net/uploads/2019/03/Can-dogs-eat-mango_2.png"
                      title="Contemplative Reptile"
                    />
                    <CardContent>

                        <Typography gutterBottom variant="h5" component="h2">
                        Can Dogs Eat Mango?
                        </Typography>

                        <Typography variant="body2" color="textSecondary" component="p">
                        Dogs can safely eat small pieces of mango, occasionally, provided the pit is removed. Since dogs don’t need the vitamins in ripe mangos, and these juicy fruits are high in sugar, 
                        only give your dog a small slice without any remaining outer skin.
                        </Typography>

                    </CardContent>

                </CardActionArea>

                <CardActions className={classes.CardActions}>

                  <Box className={classes.author}>
                      <Avatar src="https://images.unsplash.com/photo-1592468257342-8375cb556a69?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80" />
                      <Box ml={2}>
                        <Typography variant="subtitle2" component="p">
                        Reading Time: 3 mins, 27 secs.
                        </Typography>
                        <Typography variant="subtitle2" color="textSecondary" component="p">
                        November 13th, 2020
                        </Typography>
                      </Box>
                  </Box>
                  
                  <Box>
                      <BookmarkBorderIcon />
                  </Box>
                </CardActions>
              </Card> 
          </Grid>
         
        </Grid>

      </Container>


    </div>
  );
}

export default Nutrition;
