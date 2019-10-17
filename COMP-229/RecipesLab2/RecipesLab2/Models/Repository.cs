using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RecipesLab2.Models
{
  public class Repository
  {
    private static List<GuestReponse> guestReponses = new List<GuestReponse>();
    private static List<Recipe> recipes = new List<Recipe>();
    public static IEnumerable<GuestReponse> Responses
    {
      get
      {
        return guestReponses;
      }
    }

    public static void AddResponse(GuestReponse response)
    {
      guestReponses.Add(response);
    }

    public static IEnumerable<Recipe> Recipes
    {
      get
      {
        return recipes;
      }
    }
    public static void AddRecipe(Recipe recipe)
    {
      recipes.Add(recipe);
    }
  }
}
