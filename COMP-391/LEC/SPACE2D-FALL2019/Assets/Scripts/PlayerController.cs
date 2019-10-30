using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Serialization;

public class PlayerController : MonoBehaviour
{
    private Rigidbody2D _player;

    public float speed = 30.0f;
    public GameObject laser;
    public Transform laserSpawn;
    public float fireRate = 0.5f;

    public Vector2 bottomLeftBoundarie;
    public Vector2 topRigthBoundarie;
    
    private float counter = 0.0f;
    // Start is called before the first frame update
    void Start()
    {
        _player = GetComponent<Rigidbody2D>();
        _player.transform.position = new Vector2(-6.5f, 0.0f);
    }

    void Update()
    {
        counter += Time.deltaTime;

        if (Input.GetKey(KeyCode.Space) && counter > fireRate)
        {
            Instantiate(laser, laserSpawn.position, laser.transform.rotation);
            counter = 0.0f;
        }
    }

    // Update is called once per frame
    void FixedUpdate()
    {
        var moveVertical = Input.GetAxis("Vertical") * speed;
        var moveHorizontal = Input.GetAxis("Horizontal") * speed;
        
        _player.velocity = new Vector2(moveHorizontal, moveVertical);
        _player.position = new Vector2(
            Mathf.Clamp(_player.position.x, bottomLeftBoundarie.x, topRigthBoundarie.x),
            Mathf.Clamp(_player.position.y, bottomLeftBoundarie.y, topRigthBoundarie.y));
    }
}
