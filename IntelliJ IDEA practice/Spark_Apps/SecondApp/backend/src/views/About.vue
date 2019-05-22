<template>
  <div class="about">
    <h1>This is an about page</h1>
    <h1>{{testVue}}</h1>
    <h2>my name is: {{myName}}</h2>
    <h3>small text is: {{boolean}}</h3>
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
        myName: "",
        boolean: "true"
      };
    },
    created: function() {
      axios.get("/brandon").then(response => {
        this.myName = response.data;
      })}
    // name: 'home',
    // components: {
    //   HelloWorld
    // }
  }
</script>