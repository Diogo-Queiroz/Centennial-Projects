using Microsoft.AspNetCore.Http;
using Newtonsoft.Json;
using Newtonsoft.Json.Serialization;

namespace SportsStore.Infrastructure
{
  public static class SessionExtensions
  {
    public static void SetJson(this ISession sesion, string key, object value)
    {
      sesion.SetString(key, JsonConvert.SerializeObject(value));
    }

    public static T GetJson<T>(this ISession session, string key)
    {
      var sessionData = session.GetString(key);
      return sessionData == null ? default(T) : JsonConvert.DeserializeObject<T>(sessionData);
    }
  }
}