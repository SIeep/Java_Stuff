<template>
  <div class="home">
    <h1>{{testVue}}</h1>
    <h1>{{myName}}</h1>
  </div>
</template>

<script>
// @ is an alias to /src
const axios = require('axios');
import HelloWorld from '@/components/HelloWorld.vue'

export default {
    data: function() {
      return {
        testVue: "test",
        myName: ""
      };
    },
  created: function() {
    axios.get("localhost:4567/brandon").then(response => {
      this.myName = response.data;
    })}
  // name: 'home',
  // components: {
  //   HelloWorld
  // }
}
</script>
